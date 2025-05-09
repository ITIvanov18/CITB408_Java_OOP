package Repo;

public class Document {

    private static int maxCharactersInTitle;
    private String title;
    private String format;
    private double docSize;

    public Document() {
    }

    public Document(String title, String format, double docSize) {
        this.title = title;
        this.format = format;
        this.docSize = docSize;
    }

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public double getDocSize() {
        return docSize;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setDocSize(double docSize) {
        this.docSize = docSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", docSize=" + docSize +
                '}';
    }
}



