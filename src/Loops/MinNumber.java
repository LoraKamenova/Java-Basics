package Loops;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println(minNumber);
    }
}
