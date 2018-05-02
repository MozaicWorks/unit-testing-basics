import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopDuplicationTests {

    @Test
    public void basket_with_seven_books_should_cost_100_euros() {
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
    public void basket_with_seven_books_should_have_seven_items() {
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
        double numberOfItems = basket.numberOfItems();
        assertEquals(numberOfItems, 7);
    }

    @Test
    public void basket_with_seven_books_should_have_10_percent_discount() {
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
        double discount = basket.discount();
        assertEquals(discount, 10);
    }
}

