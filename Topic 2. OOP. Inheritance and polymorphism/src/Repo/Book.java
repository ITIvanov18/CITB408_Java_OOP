package Repo;

public class Book extends Document{
    private final String ISBN;
    private Author author;
    private Document title;

    public Book(String ISBN, Author author, Document title) {
//        super();
        this.ISBN = ISBN;
        this.author = author;
    }

    public Book(String title, String format, double docSize, String ISBN, Author author) {
        super(title, format, docSize);
        this.ISBN = ISBN;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", author=" + author +
                ", title=" + title +
                "} ";
    }
}
