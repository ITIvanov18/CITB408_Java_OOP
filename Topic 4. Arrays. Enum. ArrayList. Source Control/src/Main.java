import repo.Document;
import repo.FormatType;
import repo.Repository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document document1 = new Document("Doc 1", 5);
        Document document2 = new Document("Doc 2", 10);
        Document document3 = new Document("Doc 3", 15);
        Document document4 = new Document("Doc 4", 25);

        Repository repository = new Repository(30);

        System.out.println(repository);

        repository.printDocuments();

        repository.addDocument(document1);
        repository.addDocument(document2);
        repository.addDocument(document3);
        repository.addDocument(document4);

        repository.printDocuments();

        Document[] documentsArray = new Document[2];
        documentsArray[0] = document1;
        documentsArray[1] = document2;

        System.out.println("Documents array list length: " + documentsArray.length);

        List<Document> documentList = new ArrayList<>();
        documentList.add(document2);
        documentList.add(document3);
        documentList.add(document2);

        documentList.remove(1);
        int size = documentList.size();
        System.out.println("Documents array list size: " + size);

        Repository repository2 = new Repository(50, documentsArray, documentList);
        System.out.println(repository2);
        repository2.printDocuments();

        Document document5 = new Document("Doc 5", 15, FormatType.PDF);
        System.out.println(document5);

        FormatType.PDF.setMaxSize(12);
        System.out.println(FormatType.PDF.getMaxSize());
    }
}