package ConditionalStatements.exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        // определен брой статисти, облекло за всеки един статист и декор.
        double decor = budget * 0.1;

        if (actors > 150) {
//            clothesPrice = clothesPrice - clothesPrice * 0.1;
            clothesPrice *= 0.9;
        }
        double neededMoney = actors * clothesPrice + decor;

        double difference = Math.abs(neededMoney - budget);
        if (neededMoney > budget) {
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.", difference);

        } else if (neededMoney <= budget) {
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
