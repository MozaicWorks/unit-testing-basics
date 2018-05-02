import java.util.List;

public interface BookRepository {
    int addBookToInventory(Book book);

    List<Book> getBooksFromInventory();
}
