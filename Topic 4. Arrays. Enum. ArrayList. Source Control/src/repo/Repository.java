package repo;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private final double capacity;

    private final Document[] documents;

    private final List<Document> documentsArrayList;

    public Repository(double capacity) {
        this.capacity = capacity;
        documents = new Document[20];
        documentsArrayList = new ArrayList<>();
    }

    public Repository(double capacity, Document[] documents, List<Document> documentsArrayList) {
        this.capacity = capacity;
        this.documents = documents;
        this.documentsArrayList = documentsArrayList;
    }

    public double getCapacity() {
        return capacity;
    }

    public Document[] getDocuments() {
        return documents;
    }

    public List<Document> getDocumentsArrayList() {
        return documentsArrayList;
    }

    public void addDocument(Document document) {
        documentsArrayList.add(document);
    }

    public void printDocuments() {
        System.out.println(this.documentsArrayList);
        for (Document document : this.documentsArrayList) {
            System.out.println(document);
        }

    }

    @Override
    public String toString() {
        return "Repository{" +
                "capacity=" + capacity +
                '}';
    }
}
