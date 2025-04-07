package repo;

public class Document {
    public String name;
    public double fileSize;
    private FormatType formatType;

    public Document(String name, double fileSize) {
        this.name = name;
        this.fileSize = fileSize;
    }

    public Document(String name, double fileSize, FormatType formatType) {
        this.name = name;
        this.fileSize = fileSize;
        this.formatType = formatType;
    }

    public String getName() {
        return name;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", fileSize=" + fileSize +
                ", formatType=" + formatType +
                '}';
    }
}
