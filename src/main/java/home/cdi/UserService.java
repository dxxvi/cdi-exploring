package home.cdi;

import home.payload.BookPayload;

import javax.enterprise.event.Observes;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserService {
    private final Date date;

    public UserService() {
        date = new Date();
    }

    public String getUserName() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date) + " Paul Walker";
    }

    public void onBookEvent(@Observes BookPayload bookPayload) {
        System.out.println(bookPayload);
    }
}
