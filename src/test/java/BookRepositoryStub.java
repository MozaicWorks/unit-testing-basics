import java.util.ArrayList;
import java.util.List;

public class BookRepositoryStub implements BookRepository {

    private List<Book> books = new ArrayList<>();

    @Override
    public int addBookToInventory(Book book) {
        boolean added = books.add(book);
        return added ? 1 : 0;
    }

    @Override
    public List<Book> getBooksFromInventory() {
        return new ArrayList<>(books);
    }
}
