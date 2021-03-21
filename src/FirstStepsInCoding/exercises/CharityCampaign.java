package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        int days = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        // Изчисления
// Изчисляваме сумата, която се изкарва на ден за всеки един от продуктите, направени от 1 сладкар:
        double cakesSum = cakes * 45;
        double wafflesSum = waffles * 5.80;
        double pancakesSum = pancakes * 3.20;
        double sumPerDay = (cakesSum + wafflesSum + pancakesSum) * chefs;
        double totalSum = sumPerDay * days;
        double charitySum = totalSum - totalSum / 8;

        // Принтиране
        System.out.printf("%.2f", charitySum);
    }
}
