package ExamPrep.Exam6and7April2019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucherAmount = Integer.parseInt(scanner.nextLine());
        String purchase = scanner.nextLine();
        int tickets = 0;
        int others = 0;
        while (!purchase.equals("End")) {
            // Ако името на покупката съдържа повече от 8 символа
            if (purchase.length() > 8) {
                int ticketPrice = purchase.charAt(0) + purchase.charAt(1);
                voucherAmount -= ticketPrice;
                if (voucherAmount < 0) {
                    break;
                }
                tickets++;
            } else {
                int price = purchase.charAt(0);
                voucherAmount -= price;
                if (voucherAmount < 0) {
                    break;
                }
                others++;
            }
            purchase = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(others);
    }
}
