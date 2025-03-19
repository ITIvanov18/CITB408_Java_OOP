public class Manufacturer {

    private final String name;
    private final boolean extendedWarranty;

    public Manufacturer(String name, boolean extendedWarranty) {
        this.name = name;
        this.extendedWarranty = extendedWarranty;
    }

    public String getName() {
        return name;
    }

    public boolean hasExtendedWarranty() {
        return extendedWarranty;
    }
}


