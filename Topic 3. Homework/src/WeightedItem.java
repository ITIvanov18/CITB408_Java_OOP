public class WeightedItem extends DeliverableItem {
    private double weight;
    private double pricePerKg;
    private final Material material;

    public WeightedItem(boolean toClientsAddress, Material material, double weight, double pricePerKg) {
        super(toClientsAddress);
        this.material = material;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public double deliveryPrice() {
        if(pricePerKg < 1) {
            pricePerKg = 1;
        }
        if(weight < 1) {
            weight = 1;
        }
        double deliveryPrice = weight * pricePerKg;
        if(toClientsAddress()){
            deliveryPrice+=getAdditionalPrice();
        }
        if(material.isFragile()) {
            deliveryPrice *= 1.01;
        }
        return deliveryPrice;
    }
}
