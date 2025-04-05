public abstract class DeliverableItem implements Deliverable{
    private final boolean toClientsAddress;
    private static double additionalPrice;

    public DeliverableItem(boolean toClientsAddress) {
        this.toClientsAddress = toClientsAddress;
    }

    public double getAdditionalPrice() {
        if(additionalPrice < 1) {
            additionalPrice = 1;
        }
        return additionalPrice;
    }

    public static void setAdditionalPrice(double additionalPrice) {
        DeliverableItem.additionalPrice = additionalPrice;
    }

    public boolean toClientsAddress() {
        return toClientsAddress;
    }

    public abstract double deliveryPrice();
}
