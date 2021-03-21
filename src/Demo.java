import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int time = hour * 60 + minutes;
        int mondayTime = 15 * 60 + 30;

        switch (day) {
            case "Monday":
                if (price > 100 && time > mondayTime) {
                    System.out.println("You have 10% discount.");
                }else {
                    System.out.println("You don't have discount");
                }
                break;
            case "Tuesday":
                if (price > 100 && time < 12 * 60) {
                    System.out.println("You have 10% discount.");
                }else {
                    System.out.println("You don't have discount");
                }
                break;
            case "Wednesday":
                if (price > 100 ) {
                    System.out.println("You have 10% discount.");
                }else {
                    System.out.println("You don't have discount");
                }
                break;
            default:
                System.out.println("You don't have discount");
                break;
        }

    }
}
