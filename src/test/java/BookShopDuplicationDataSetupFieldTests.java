import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopDuplicationDataSetupFieldTests {
    private Basket basket = new Basket(TestData.HARRY_POTTER_SERIES);

    @Test
    public void basket_with_seven_books_should_cost_100_euros() {
        double price = basket.price();
        assertEquals(price, 100);
    }

    @Test
    public void basket_with_seven_books_should_have_seven_items() {
        double numberOfItems = basket.numberOfItems();
        assertEquals(numberOfItems, 7);
    }

    @Test
    public void basket_with_seven_books_should_have_10_percent_discount() {
        double discount = basket.discount();
        assertEquals(discount, 10);
    }
}

