package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double volleyballTime = 0;
        // Игрите през weekends
        volleyballTime += (48 - h) * 3.0 / 4;

        // Игрите през празничните дни
        volleyballTime += p * 2.0 / 3;

        // Игрите в родното място
        volleyballTime += h;

        // Проверка за високосна година
        if (year.equals("leap")) {
            volleyballTime *= 1.15;
        }

        // Принтираме
        System.out.printf("%.0f",Math.floor(volleyballTime));


    }
}
