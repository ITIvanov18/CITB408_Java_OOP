public class Material {
    private String materialName;
    private final boolean isFragile;

    public Material(String materialName, boolean isFragile) {
        this.materialName = materialName;
        this.isFragile = isFragile;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}
