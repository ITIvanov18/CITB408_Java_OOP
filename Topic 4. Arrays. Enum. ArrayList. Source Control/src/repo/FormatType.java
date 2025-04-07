package repo;

public enum FormatType {
    TXT(10), PDF(5), JPG(40), JPEG(40), GIF(20), PNG(60);


    public double maxSize;

    FormatType(double maxSize) {
        this.maxSize = maxSize;
    }

    public double getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(double maxSize) {
        this.maxSize = maxSize;
    }
}
