import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String materialName = bufferedReader.readLine();

        boolean isFragile = Integer.parseInt(bufferedReader.readLine().trim()) != 0;

        boolean toClientsAddress = Integer.parseInt(bufferedReader.readLine().trim()) != 0;

        double minPrice = Double.parseDouble(bufferedReader.readLine().trim());

        double weight = Double.parseDouble(bufferedReader.readLine().trim());

        double pricePerKg = Double.parseDouble(bufferedReader.readLine().trim());

        double additionalPrice = Double.parseDouble(bufferedReader.readLine().trim());

        DeliverableItem.setAdditionalPrice(additionalPrice);
        Material material1 = new Material(materialName, isFragile);
        Deliverable deliverableItem1;

        deliverableItem1 = new Document(toClientsAddress, minPrice);
        System.out.println(deliverableItem1.deliveryPrice());

        deliverableItem1 = new WeightedItem(toClientsAddress, material1, weight, pricePerKg);
        System.out.println(deliverableItem1.deliveryPrice());

        bufferedReader.close();
    }
}