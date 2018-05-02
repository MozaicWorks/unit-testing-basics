public class BookShopDiscounterWithWrapper {

    private DateWrapper dateWrapper;

    public BookShopDiscounterWithWrapper(DateWrapper dateWrapper) {
        this.dateWrapper = dateWrapper;
    }

    public int limitedTimeOfferDiscount(Book... books) {
        if (dateWrapper.now().before(dateWrapper.christmas())) {
            return 20;
        }
        return 10;
    }
}
