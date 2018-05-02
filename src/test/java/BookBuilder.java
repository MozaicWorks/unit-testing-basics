import java.util.ArrayList;
import java.util.List;

public class BookBuilder {

    private String author = "Default Author";
    private String title = "Default title";
    private String isbn = "000-00000-000";

    public BookBuilder withDefaultValues() {
        return this;
    }

    public BookBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder withIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Book build() {
        return new Book(author, title, isbn);
    }

    public Book[] listOfBooks(int number) {
        List<Book> books;
        books = new ArrayList<Book>(number);
        for (int i = 0; i < number; i++) {
            books.add(this.withDefaultValues().build());
        }
        return books.toArray(new Book[0]);
    }
}
