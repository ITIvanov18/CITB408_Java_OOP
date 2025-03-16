//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.math.*;

class Studio {
    private final long id;
    private BigDecimal hourlyRate;
    private int maxHours;
    private int hoursUsed;
    private static BigDecimal minHourlyRate;
    private static BigDecimal euroExchangeRate;

    // Конструктор с валидация за максимални часове
    public Studio(long id, int maxHours) {
        this.id = id;
        this.maxHours = (maxHours >= 0 && maxHours <= 24) ? maxHours : 24;
    }

    // Статични методи за глобални настройки
    public static void setMinHourlyRate(double minRate) {
        minHourlyRate = BigDecimal.valueOf(Math.max(minRate, 0));
    }

    public static void setEuroExchangeRate(double rate) {
        euroExchangeRate = BigDecimal.valueOf(rate);
    }

    // Сетъри с валидация
    public void setHourlyRate(double rate) {
        double minRate = minHourlyRate != null ? minHourlyRate.doubleValue() : 0;
        this.hourlyRate = BigDecimal.valueOf(Math.max(rate, minRate));
    }

    public void setHoursUsed(int hours) {
        this.hoursUsed = Math.min(hours, maxHours);
    }

    // Методи за изчисления
    public BigDecimal calculateRevenueLv() {
        return hourlyRate.multiply(BigDecimal.valueOf(hoursUsed));
    }

    public BigDecimal calculateRevenueEuro() {
        return calculateRevenueLv().multiply(euroExchangeRate);
    }

    // Методи за сравнение
    public Studio compareByRate(Studio other) {
        int comparison = this.hourlyRate.compareTo(other.hourlyRate);
        if (comparison != 0) {
            return comparison > 0 ? this : other;
        }
        return this.id > other.id ? this : other;
    }

    public boolean hasHigherRevenueThan(Studio other) {
        return this.calculateRevenueLv().compareTo(other.calculateRevenueLv()) > 0;
    }

    // Гетъри
    public long getId() {
        return id;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public int getMaxHours() {
        return maxHours;
    }

    public int getHoursUsed() {
        return hoursUsed;
    }

    public static BigDecimal getMinHourlyRate() {
        return minHourlyRate;
    }

    public static BigDecimal getEuroExchangeRate() {
        return euroExchangeRate;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Прочитане на входни данни за първия студио
        long studio1Id = Long.parseLong(reader.readLine().trim());
        int studio1MaxHours = Integer.parseInt(reader.readLine().trim());
        double globalMinRate = Double.parseDouble(reader.readLine().trim());
        double euroRate = Double.parseDouble(reader.readLine().trim());
        double studio1Rate = Double.parseDouble(reader.readLine().trim());
        int studio1Hours = Integer.parseInt(reader.readLine().trim());

        // Инициализация на глобални настройки
        Studio.setMinHourlyRate(globalMinRate);
        Studio.setEuroExchangeRate(euroRate);

        Studio studio1 = new Studio(studio1Id, studio1MaxHours);
        studio1.setHourlyRate(studio1Rate);
        studio1.setHoursUsed(studio1Hours);

        long studio2Id = Long.parseLong(reader.readLine().trim());
        int studio2MaxHours = Integer.parseInt(reader.readLine().trim());
        double studio2Rate = Double.parseDouble(reader.readLine().trim());
        int studio2Hours = Integer.parseInt(reader.readLine().trim());

        Studio studio2 = new Studio(studio2Id, studio2MaxHours);
        studio2.setHourlyRate(studio2Rate);
        studio2.setHoursUsed(studio2Hours);

        System.out.println("Приходи в лева: " + studio1.calculateRevenueLv());
        System.out.println("Приходи в евро: " + studio1.calculateRevenueEuro());
        System.out.println("Студио с по-висока цена: " + studio1.compareByRate(studio2).getId());
        System.out.println("Първото студио има по-големи приходи: " + studio1.hasHigherRevenueThan(studio2));

        reader.close();
    }
}