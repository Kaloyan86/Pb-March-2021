package ConditionalStatements.exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

//        Ако числото е до 100 включително, бонус точките са 5.
        if (number <= 100) {
            bonus = 5;
        } else if (number < 1001) {
//        Ако числото е по-голямо от 100, бонус точките са 20% от числото.
            bonus = number * 0.2;
        } else {
//        Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
            bonus = number * 0.1;
        }


        // Допълнителни точки
        if (number % 2 == 0) {
            bonus += 1;
        } else if (number % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
