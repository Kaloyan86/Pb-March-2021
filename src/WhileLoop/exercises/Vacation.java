package WhileLoop.exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        boolean isFailed = false;
        int allDays = 0;
        while (moneyOnHand < excursionPrice) {
            // Вид действие - текст с възможности "spend" и "save".
            String command = scanner.nextLine();
            // Сумата, която ще спести/похарчи
            double money = Double.parseDouble(scanner.nextLine());
            allDays++;
            switch (command) {
                case "spend":
                    spendDays++;
                    moneyOnHand -= money;
                    if (moneyOnHand < 0) {
                        moneyOnHand = 0;
                    }
                    break;
                case "save":
                    spendDays = 0;
                    moneyOnHand += money;
                    break;
            }
            if (spendDays == 5) {
//                isFailed = true;
                break;
            }
        }
        if (moneyOnHand < excursionPrice) {
            System.out.printf("You can't save the money.%n"
                    + "%d", allDays);
        } else {
            System.out.printf("You saved the money for %d days.", allDays);
        }
    }
}
