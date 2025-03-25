public class WashingMachine extends ElectricDevice {

    private final boolean hasDryer;

    public WashingMachine(Manufacturer manufacturer, int minWarranty, boolean hasDryer) {
        super(manufacturer, minWarranty);
        this.hasDryer = hasDryer;
    }



    @Override
    public int warranty() {
        int baseWarranty = super.warranty();
        if (hasDryer) {
            baseWarranty += getMinWarranty() / 2;
        }
        return baseWarranty;
    }
}
