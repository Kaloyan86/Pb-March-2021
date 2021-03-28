package ForLoops.exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isLost = false;

        for (int i = 0; i < n; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0){
                isLost = true;
                break;
            }

        }
        if (isLost){
            System.out.println("You have lost your salary.");
        }else {
            System.out.println(salary);
        }
    }
}
