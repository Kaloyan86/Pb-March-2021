package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        // Изчисления

        // сума = депозирана сума  + срок на депозита * (сумата за един месец)
        // сумата за един месец = (депозирана сума * годишен лихвен процент ) / 12
        double sumPerMonth = (depositSum * interestRate / 100) / 12;
        double totalSum = depositSum + months * sumPerMonth;

        // Принтиране
        System.out.println(totalSum);
    }
}
