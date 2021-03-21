package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        double usd = Double.parseDouble(scanner.nextLine());

        // Конвертиране на долар в лева
        // 1 USD = 1.79549 BGN.
        double bgn = usd * 1.79549;

        // Принтиране на резултата
        System.out.println(bgn);

    }
}
