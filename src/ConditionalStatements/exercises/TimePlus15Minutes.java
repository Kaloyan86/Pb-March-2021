package ConditionalStatements.exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        // Времето в минути с прибавени 15 минути
        int totalTimeInMinutes = hour * 60 + minutes + 15;
        int h = totalTimeInMinutes / 60;
        int m = totalTimeInMinutes % 60;
        if (h > 23) {
            h = 0;
        }
        System.out.printf("%d:%02d", h, m);
    }
}
