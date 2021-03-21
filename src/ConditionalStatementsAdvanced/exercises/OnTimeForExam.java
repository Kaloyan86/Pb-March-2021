package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());
        // Превръщаме времето в минути
        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;
        String output = "";
        String output2 = "";
        int diff = 0;
        if (arriveTime < examTime - 30) { // Early
            output = "Early";
            diff = examTime - arriveTime;
            if (diff < 60) {
                output2 = String.format("%d minutes before the start", diff);

            } else {
                int h = diff / 60;
                int m = diff % 60;
                output2 = String.format("%d:%02d hours before the start", h, m);
            }

        } else if (arriveTime <= examTime) { // On Time
            output = "On time";
            diff = examTime - arriveTime;
            output2 = String.format("%d minutes before the start", diff);

        } else if (arriveTime > examTime) { // Late
            output = "Late";
            diff = arriveTime - examTime;
            if (diff < 60) {
                output2 = String.format("%d minutes after the start", diff);
            } else {
                diff = arriveTime - examTime;
                int hours = diff / 60;
                int minutes = diff % 60;
                output2 = String.format("%d:%02d hours after the start", hours, minutes);
            }
        }

        System.out.println(output);
        System.out.println(output2);
    }
}
