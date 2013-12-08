package home.payload;

import java.awt.print.Book;

public class BookPayload {
    private String isbn;
    private String title;

    @Override
    public String toString() {
        return "BookPayload {" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public BookPayload setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BookPayload setTitle(String title) {
        this.title = title;
        return this;
    }
}
