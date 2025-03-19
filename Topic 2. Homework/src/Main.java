import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String manufacturerName = bufferedReader.readLine();

        boolean hasExtendedWarranty = Integer.parseInt(bufferedReader.readLine().trim()) != 0;

        int minWarranty = Integer.parseInt(bufferedReader.readLine().trim());

        boolean hasGas = Integer.parseInt(bufferedReader.readLine().trim()) != 0;

        boolean hasDryer = Integer.parseInt(bufferedReader.readLine().trim()) != 0;

        Manufacturer proizvoditel = new Manufacturer(manufacturerName, hasExtendedWarranty);
        ElectricDevice elektroured = new ElectricDevice(proizvoditel, minWarranty);
        System.out.println(elektroured.warranty());

        elektroured = new Cooker(proizvoditel, minWarranty, hasGas);
        System.out.println(elektroured.warranty());

        elektroured = new WashingMachine(proizvoditel, minWarranty, hasDryer);
        System.out.println(elektroured.warranty());
    }
}