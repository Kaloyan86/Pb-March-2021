package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на входни данни
        double radians = Double.parseDouble(scanner.nextLine());

        // Изчисления
        // градус = радиан * 180 / π
        double degrees = radians * 180 / Math.PI;

        // Принтиране
        System.out.printf("%.0f", degrees);
    }
}
