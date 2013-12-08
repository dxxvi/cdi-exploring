package home.servlet;

import home.cdi.DateService;
import home.cdi.UserService;
import home.payload.BookPayload;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "index", urlPatterns = {"/index"})
public class Index extends HttpServlet {
    @Inject private UserService userService;
    @Inject private DateService dateService;
    @Inject private Event<BookPayload> bookPayloadEvent;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String isbn  = request.getParameter("isbn");
        String title = request.getParameter("title");
        BookPayload bookPayload = new BookPayload().setIsbn(isbn).setTitle(title);
        bookPayloadEvent.fire(bookPayload);

        request.setAttribute("name", userService.getUserName() + dateService.getTimeAndDate());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
        requestDispatcher.forward(request, response);
    }
}
