//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;

/*
Да се напише метод на Java, който намира броят на всички цели, неотрицателни числа
в даден интервал [bottom, top], които при преместване на първата им цифра най-отзад,
се увеличават с повече от дадено число difference. Пример: Интервалът [bottom, top]
е [1000, 1200] difference = 700; Примерно число, което отговаря на условието е: 1189,
при преместване на първата му цифра най-отзад се получава 1891.
Разликата между 1891 и 1189 е 702 > 700 (difference).

Input Format:
    1000
    1200
    700

Constraints:
Границите на интервала bottom и top, трябва да бъдат неотрицателни числа.
Ако не са въведени правилно, резултатът от изпълнението на метода, трябва да е 0;

Output Format:
12

Explanation:
12 числа в интервала [1000, 1200] отговарят на условието, при преместване на
първата им цифра най-отзад, да се получава число с поне 700 по-голямо от оригиналното:

1189 1891 => 1891 - 1189 = 702 > 700
1190 1901 => 1901 - 1190 = 711 > 700
1191 1911 => 1911 - 1191 = 720 > 700
1192 1921 => 1921 - 1192 = 729 > 700
1193 1931 => 1931 - 1193 = 738 > 700
1194 1941 => 1941 - 1194 = 747 > 700
1195 1951 => 1951 - 1195 = 756 > 700
1196 1961 => 1961 - 1196 = 765 > 700
1197 1971 => 1971 - 1197 = 774 > 700
1198 1981 => 1981 - 1198 = 783 > 700
1199 1991 => 1991 - 1199 = 792 > 700
1200 2001 => 2001 - 1200 = 801 > 700
*/

class Result {

    public static int countNumbers(int bottom, int top, int difference) {
        int counter = 0, newNumber, temp, divisor, firstDigit, remainingPart;

        if (bottom < 0 || top < 0) {
            return 0;
        }

        for (int i = bottom; i <= top; i++) {
            temp = i;
            divisor = 1;

            while (temp >= 10) {
                divisor *= 10;
                temp /= 10;
            }

            firstDigit = i / divisor;
            remainingPart = i % divisor;
            newNumber = remainingPart * 10 + firstDigit;

            if ((newNumber - i) > difference) {
                counter++;
            }
        }
        return counter;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int bottom = Integer.parseInt(bufferedReader.readLine().trim());

        int top = Integer.parseInt(bufferedReader.readLine().trim());

        int difference = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.countNumbers(bottom, top, difference);

        System.out.println(result);
        bufferedReader.close();
    }
}

