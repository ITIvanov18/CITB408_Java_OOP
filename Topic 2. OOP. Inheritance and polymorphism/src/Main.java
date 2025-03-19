import Vehicles.Car;
import Vehicles.Engine;
import Vehicles.Vehicle;
import Repo.Document;
import Repo.Repository;
import Repo.Author;
import Repo.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*      Engine engine = new Engine();
        Vehicle vehicle = new Vehicle(engine);
        System.out.println(vehicle.toString());
        Car car = new Car( engine, true);
        System.out.println(car);*/

        Document doc1 = new Document();
        Document doc2 = new Document("Zaglavie", "pdf", 5);
        System.out.println(doc1);
        System.out.println(doc2);

        Author author1 = new Author("Ivan", "Vazov");
        Author author2 = new Author("Geo", "Milev");

        Document title1 = new Document();
        Document title2 = new Document();

        Book book1 = new Book("890890", author1, title1);
        Book book2 = new Book("Book 2", "txt", 3, "111111", author2);
        System.out.println(book1);
        System.out.println(book2);

        Repository repository = new Repository(10);
        System.out.println(repository);

    }
}