public class Document extends DeliverableItem{
    private double minPrice;

    public Document(boolean toClientsAddress, double minPrice) {
        super(toClientsAddress);
        this.minPrice = minPrice;
    }

    @Override
    public double deliveryPrice() {
        if(minPrice < 1) {
            minPrice = 1;
        }
        if(toClientsAddress()) {
            return minPrice + getAdditionalPrice();
        } else {
            return minPrice;
        }
    }
}
