import java.util.Date;
import java.util.List;

public class BookShopDiscounterWithoutWrapper {

    public int limitedTimeOfferDiscount(List<Book> books) {
        final Date CHRISTMAS = new Date(2018, 12, 25);
        if (new Date().before(CHRISTMAS)) {
            return 20;
        }
        return 10;
    }
}
