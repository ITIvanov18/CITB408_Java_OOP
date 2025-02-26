//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Videos.Video;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("V1#", "Lecture 1", 90, 0, false);
        Video video2 = new Video("V2#", "Lecture 2", 90);
        Video video3 = new Video("V3#");

        System.out.println(video1);
        System.out.println(video2);
        System.out.println(video3);

        BigDecimal number1 = BigDecimal.valueOf(100);
        BigDecimal number2 = BigDecimal.valueOf(20);
        BigDecimal total = number1.add(number2);

        System.out.println("Total: " + total);

        // Сравнение на BigDecimal
        if (number1.compareTo(number2) > 0) {
            System.out.println("number1 is greater than number2");
        } else {
            System.out.println("number1 is not greater than number2");
        }

        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalDate date1 = LocalDate.of(2023, 1, 15);
        long yearsBetween = ChronoUnit.YEARS.between(date1, today);
        System.out.println("Years between " + date1 + " and " + today + ": " + yearsBetween);
    }
}
