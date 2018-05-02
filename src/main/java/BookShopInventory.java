import java.util.List;

public class BookShopInventory {

    private BookRepository bookRepository;

    public BookShopInventory(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBookToInventory(String author, String title, String isbn) {
        Book book = new Book(author, title, isbn);
        bookRepository.addBookToInventory(book);
        return book;
    }

    public List<Book> getBooksFromInventory() {
        return bookRepository.getBooksFromInventory();
    }
}
