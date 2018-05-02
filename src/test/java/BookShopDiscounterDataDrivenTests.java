import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopDiscounterDataDrivenTests {

    @DisplayName("Discount should be 20 percent")
    @ParameterizedTest(name = "for year {0}, month {1}, day {2}")
    @CsvSource({
            "2017, 12, 26",
            "2018, 10, 29",
            "2018, 11, 30",
            "2018, 12, 20",
            "2018, 12, 23",
            "2018, 12, 24",
    })
    public void discount_should_be_20_percent_before_christmas_2018(int year, int month, int day) {
        DateWrapper beforeChristmasWrapper = dateWrapper(year, month, day);
        BookShopDiscounterWithWrapper bookShopDiscounter = new BookShopDiscounterWithWrapper(beforeChristmasWrapper);
        int discount = bookShopDiscounter.limitedTimeOfferDiscount(TestData.HARRY_POTTER_SERIES);
        assertEquals(discount, 20);
    }

    @DisplayName("Discount should be 20 percent")
    @ParameterizedTest(name = "for year {0}, month {1}, day {2}")
    @CsvSource({
            "2018, 12, 25",
            "2018, 12, 26",
            "2018, 12, 27",
            "2019, 1, 10",
            "2019, 2, 11",
            "2020, 5, 11",
            "2021, 10, 29",
    })
    public void discount_should_be_10_percent_after_christmas_2018(int year, int month, int day) {
        DateWrapper afterChristmasWrapper = dateWrapper(year, month, day);
        BookShopDiscounterWithWrapper bookShopDiscounter = new BookShopDiscounterWithWrapper(afterChristmasWrapper);
        int discount = bookShopDiscounter.limitedTimeOfferDiscount(TestData.HARRY_POTTER_SERIES);
        assertEquals(discount, 10);
    }

    public DateWrapper dateWrapper(int year, int month, int day) {
        return new DateWrapper() {
            @Override
            public Date now() {
                return new Date(year, month, day);
            }

            @Override
            public Date christmas() {
                final Date CHRISTMAS = new Date(2018, 12, 25);
                return CHRISTMAS;
            }
        };
    }
}
