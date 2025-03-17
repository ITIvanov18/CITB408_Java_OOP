public class ElectricDevice {

    private final Manufacturer manufacturer;
    private int minWarranty;

    public ElectricDevice(Manufacturer manufacturer, int minWarranty) {
        this.manufacturer = manufacturer;
        this.minWarranty = minWarranty;
    }

    public int getMinWarranty() {
        return minWarranty;
    }

    public int warranty() {
        if(minWarranty < 6){
            minWarranty = 6;
        }
        int extendedWarranty = 0;
        if (manufacturer.hasExtendedWarranty()){
            extendedWarranty += 12;
        }
        return minWarranty + extendedWarranty;
    }
}
