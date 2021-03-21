package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;
        // Switch case по сезоните
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                // Отстъпка според броя на рибарите
                if (fishers <= 6) {
                    boatPrice *= 0.90;
                } else if (fishers <= 11) {
                    boatPrice *= 0.85;
                } else {
                    boatPrice *= 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                if (fishers <= 6) {
                    boatPrice *= 0.90;
                } else if (fishers <= 11) {
                    boatPrice *= 0.85;
                } else {
                    boatPrice *= 0.75;
                }
                break;
            case "Winter":
                boatPrice = 2600;
                if (fishers <= 6) {
                    boatPrice *= 0.90;
                } else if (fishers <= 11) {
                    boatPrice *= 0.85;
                } else {
                    boatPrice *= 0.75;
                }
                break;
        }
        // Допълнителна отстъпка
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            boatPrice *= 0.95;
        }
        // Проверка дали бюджета е достатъчен
        double difference = Math.abs(budget - boatPrice);
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - boatPrice));

        }
    }
}
