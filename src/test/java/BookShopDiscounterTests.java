import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopDiscounterTests {

    @Test
    public void discount_should_be_20_percent_before_christmas_2018() {
        BookShopDiscounterWithWrapper bookShopDiscounter = new BookShopDiscounterWithWrapper(beforeChristmasWrapper);
        int discount = bookShopDiscounter.limitedTimeOfferDiscount(TestData.HARRY_POTTER_SERIES);
        assertEquals(discount, 20);
    }

    @Test
    public void discount_should_be_10_percent_after_christmas_2018() {
        BookShopDiscounterWithWrapper bookShopDiscounter = new BookShopDiscounterWithWrapper(afterChristmasWrapper);
        int discount = bookShopDiscounter.limitedTimeOfferDiscount(TestData.HARRY_POTTER_SERIES);
        assertEquals(discount, 10);
    }

    DateWrapper beforeChristmasWrapper = new DateWrapper() {
        @Override
        public Date now() {
            return new Date(2018, 12, 24);
        }

        @Override
        public Date christmas() {
            final Date CHRISTMAS = new Date(2018, 12, 25);
            return CHRISTMAS;
        }
    };

    DateWrapper afterChristmasWrapper = new DateWrapper() {
        @Override
        public Date now() {
            return new Date(2018, 12, 26);
        }

        @Override
        public Date christmas() {
            final Date CHRISTMAS = new Date(2018, 12, 25);
            return CHRISTMAS;
        }
    };
}
