import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopBuilderTests {

    @Test
    public void basket_with_seven_new_books_should_cost_100_euros() {
        Basket basket = new Basket(
                new Book(
                        "J. K. Rowling",
                        "Harry Potter and the Philosopher's Stone",
                        "059035342X-1"
                ),
                new Book(
                        "J. K. Rowling",
                        "Harry Potter and the Chamber of Secrets",
                        "059035342X-2"
                ),
                new Book(
                        "J. K. Rowling",
                        "Harry Potter and the Prisoner of Azkaban",
                        "059035342X-3"
                ),
                new Book(
                        "J. K. Rowling",
                        "Harry Potter and the Goblet of Fire",
                        "059035342X-4"
                ),
                new Book(
                        "J. K. Rowling",
                        "Harry Potter and the Order of the Phoenix",
                        "059035342X-5"
                ),
                new Book(
                        "J. K. Rowling",
                        "Harry Potter and the Half-Blood Prince",
                        "059035342X-6"
                ),
                new Book(
                        "J. K. Rowling",
                        "Harry Potter and the Deathly Hallows",
                        "059035342X-7"
                )
        );
        double price = basket.price();
        assertEquals(price, 100);
    }

    @Test
    public void basket_with_seven_built_books_should_cost_100_euros() {
        Basket basket = new Basket(
                new BookBuilder()
                        .withDefaultValues()
                        .withAuthor("J. R. R. Tolkien")
                        .build(),
                new BookBuilder()
                        .withDefaultValues()
                        .withTitle("The Hobbit")
                        .build(),
                new BookBuilder()
                        .withDefaultValues()
                        .withIsbn("097-3595-5642")
                        .build(),
                new BookBuilder().withDefaultValues().build(),
                new BookBuilder().build(),
                new BookBuilder().build(),
                new BookBuilder().build()
        );
        double price = basket.price();
        assertEquals(price, 100);
    }

    @Test
    public void basket_with_seven_default_books_should_cost_100_euros() {
        Basket basket = new Basket(
                new BookBuilder().withDefaultValues().build(),
                new BookBuilder().withDefaultValues().build(),
                new BookBuilder().withDefaultValues().build(),
                new BookBuilder().withDefaultValues().build(),
                new BookBuilder().withDefaultValues().build(),
                new BookBuilder().withDefaultValues().build(),
                new BookBuilder().withDefaultValues().build()
        );
        double price = basket.price();
        assertEquals(price, 100);
    }

    @Test
    public void basket_with_a_list_of_seven_default_books_should_cost_100_euros() {
        Basket basket = new Basket(
                new BookBuilder().listOfBooks(7)
        );
        double price = basket.price();
        assertEquals(price, 100);
    }

    @Test
    public void basket_with_seven_books_should_cost_100_euros() {
        Basket basket = basketWithSevenBooks();
        double price = basket.price();
        assertEquals(price, 100);
    }

    @Test
    public void basket_with_books_should_cost_100_euros() {
        Basket basket = basketWithBooks(7);
        double price = basket.price();
        assertEquals(price, 100);
    }


    @DisplayName("Basket")
    @ParameterizedTest(name = "with {0} books should cost {1} euros")
    @CsvSource({
            "0, 0",
            "1, 20",
            "2, 40",
            "3, 50",
            "4, 70",
            "5, 80",
            "6, 90",
            "7, 100",
    })
    public void basket_with_books_should_cost_euros(int numberOfBooks, double expectedPrice) {
        Basket basket = basketWithBooks(numberOfBooks);
        double actualPrice = basket.price();
        assertEquals(expectedPrice, actualPrice);
    }

    private Basket basketWithSevenBooks() {
        return new Basket(
                new BookBuilder().listOfBooks(7)
        );
    }

    private Basket basketWithBooks(int number) {
        return new Basket(
                new BookBuilder().listOfBooks(number)
        );
    }
}

