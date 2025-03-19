public class Cooker extends ElectricDevice {

    private final boolean isGas;

    public Cooker(Manufacturer manufacturer, int minWarranty, boolean isGas) {
        super(manufacturer, minWarranty);
        this.isGas = isGas;
    }

    @Override
    public int warranty() {
        if (isGas) {
            return super.warranty() + 12;
        } else {
            return super.warranty();
        }
    }
}
