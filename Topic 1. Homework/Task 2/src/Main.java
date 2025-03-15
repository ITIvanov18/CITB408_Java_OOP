import java.io.*;

class Result {

    public static int sumOfNumbers(int size) {
        int totalSum = 0;

        if (size < 1 || size > 9) {
            return 0;
        }

        // Първа част: Обхождане от горния слой до долния
        for (int currentLayer = 1; currentLayer <= size; currentLayer++) {
            // Добавяне на числата от текущия слой до размера (възходящо)
            for (int num = currentLayer; num <= size; num++) {
                totalSum += num;
            }
            // Добавяне на същите числа (низходящо)
            for (int num = size; num >= currentLayer; num--) {
                totalSum += num;
            }
        }

        // Втора част: Обхождане от долния-1 слой обратно нагоре
        for (int currentLayer = size - 1; currentLayer >= 1; currentLayer--) {
            // Повторно добавяне на числата за текущия слой
            for (int num = currentLayer; num <= size; num++) {
                totalSum += num;
            }
            for (int num = size; num >= currentLayer; num--) {
                totalSum += num;
            }
        }

        return totalSum;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.sumOfNumbers(size);

        System.out.println(result);
        bufferedReader.close();
    }
}