//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

class Manager {

    private String name;
    private int hiringYear;
    private Month hiringMonth;
    private int hiringDay;
    private int currentYear;
    private int currentMonth;
    private int currentDay;

    public Manager(String name) {
        this.name = name;
    }

    public void setHiringDate(LocalDate of) {
        hiringYear = of.getYear();
        hiringMonth = of.getMonth();
        hiringDay = of.getDayOfMonth();
    }

    public LocalDate getHiringDate() {
        return LocalDate.of(hiringYear, hiringMonth, hiringDay);
    }

    public int numberOfYearsInCompanyTill(LocalDate of) {

        return (int) ChronoUnit.YEARS.between(getHiringDate(), of);
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();

        int hiringYear = Integer.parseInt(bufferedReader.readLine().trim());

        int hiringMonth = Integer.parseInt(bufferedReader.readLine().trim());

        int hiringDay = Integer.parseInt(bufferedReader.readLine().trim());

        int currentYear = Integer.parseInt(bufferedReader.readLine().trim());

        int currentMonth = Integer.parseInt(bufferedReader.readLine().trim());

        int currentDay = Integer.parseInt(bufferedReader.readLine().trim());

        // Create an object of type Manager. Use one parameter constructor with argument name: Manager(name)

        Manager manager = new Manager(name);

        // Call the set method to set the hiring date of Ivan. Pass year, month, and day as parameters: setHiringDate(LocalDate.of(hiringYear, hiringMonth, hiringDay))

        if(LocalDate.of(hiringYear, hiringMonth, hiringDay).isAfter(LocalDate.of(currentYear, currentMonth, currentDay))){
            manager.setHiringDate(LocalDate.of(2020, 1, 1));
        }
        manager.setHiringDate(LocalDate.of(hiringYear, hiringMonth, hiringDay));

        // Print on the console the result of getting the hiring date

        System.out.println(manager.getHiringDate());

        // Print on the console the result of calling numberOfYearsInCompanyTill() method. The method has to be called with a parameter of type LocalDate using currentYear, currentMonth, currentDay: numberOfYearsInCompanyTill(LocalDate.of(currentYear, currentMonth, currentDay))

        System.out.println(manager.numberOfYearsInCompanyTill(LocalDate.of(currentYear, currentMonth, currentDay)));

        bufferedReader.close();
    }
}