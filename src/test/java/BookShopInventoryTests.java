import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookShopInventoryTests {

    String author = "J. R. R. Tolkien";
    String title = "The Lord of the Rings";
    String isbn = "978-0-00-821419-7";

    private Book theLordOfTheRings = new Book(author, title, isbn);

    private BookShopInventory bookShopInventory =
            new BookShopInventory(new BookRepositoryStub());

    @Test
    public void adding_book_details_to_inventory_should_return_book() {
        Book book = bookShopInventory.addBookToInventory(
                author,
                title,
                isbn
        );
        assertEquals(book, theLordOfTheRings);
    }

    @Test
    public void new_book_inventory_should_be_empty() {
        List<Book> books = bookShopInventory.getBooksFromInventory();
        assertTrue(books.isEmpty());
    }

    @Test
    public void book_inventory_should_contain_exactly_one_book_after_adding_it_to_empty_inventory() {
        Book book = bookShopInventory.addBookToInventory(
                author,
                title,
                isbn
        );
        List<Book> books = bookShopInventory.getBooksFromInventory();
        assertTrue(listContainsExactlyOneBook(books, book));
    }

    private boolean listContainsExactlyOneBook(List<Book> books, Book book) {
        return contains(book).matches(books);
    }
}

