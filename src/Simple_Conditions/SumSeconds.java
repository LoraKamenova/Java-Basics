package Simple_Conditions;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;

        if (totalTime <= 59) {
            if (totalTime <= 9) {
                System.out.printf("0:0%d", totalTime);
            } else {
                System.out.printf("0:%d", totalTime);
            }
        } else if (totalTime <= 119) {
            if (totalTime - 60 <= 9) {
                System.out.printf("1:0%d", totalTime - 60);
            } else {
                System.out.printf("1:%d", totalTime - 60);
            }
        } else if (totalTime <= 179) {
            if (totalTime - 120 <= 9) {
                System.out.printf("2:0%d", totalTime - 120);
            } else {
                System.out.printf("2:%d", totalTime - 120);
            }
        }
    }
}
