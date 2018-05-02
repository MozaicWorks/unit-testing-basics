import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopNamingClassMethodTests {

    @Test
    public void test_Basket_price_zero() {
        Basket emptyBasket = new Basket();
        double price = emptyBasket.price();
        assertEquals(price, 0);
    }

    @Test
    public void test_Basket_price_and_numberOfItems() {
        Basket emptyBasket = new Basket();
        double price = emptyBasket.price();
        int numberOfItems = emptyBasket.numberOfItems();
        assertEquals(price, 0);
        assertEquals(numberOfItems, 0);
    }

    @Test
    public void test_BasketWidget_priceDisplayed_after_mount_and_render() {
        BasketWidget basketWidget = new BasketWidget();
        basketWidget.componentDidMount();
        basketWidget.render();
        double price = basketWidget.priceDisplayed();
        assertEquals(price, 0);
    }

    @Test
    public void test_Basket_price_100() {
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
}

