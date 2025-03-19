package Repo;

public class Novel extends Book {

    private String novelAbstract;

    public Novel(String title, String format, double docSize, String ISBN, Author author, Document title1, String novelAbstract) {
        super(title, format, docSize, ISBN, author);
        this.novelAbstract = novelAbstract;
    }

    public Novel(String ISBN, Author author, Document title, String novelAbstract) {
        super(ISBN, author, title);
        this.novelAbstract = novelAbstract;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "novelAbstract='" + novelAbstract + '\'' +
                "} " + super.toString();
    }
}
