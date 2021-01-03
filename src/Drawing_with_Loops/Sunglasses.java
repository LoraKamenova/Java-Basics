package Drawing_with_Loops;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//first row
        for (int row = 0; row < n * 2; row++) {
            System.out.print("*");
        }
        for (int row = 0; row < n; row++) {
            System.out.print(" ");
        }
        for (int row = 0; row < n * 2; row++) {
            System.out.print("*");
        }
        System.out.println();

//middle rows
        for (int row = 0; row < n - 2; row++) {
            System.out.print("*");

            for (int col = 0; col < n * 2 - 2; col++) {
                System.out.print("/");
            }
            System.out.print("*");

            if (row == (n - 1) / 2 - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("|");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
            }

            System.out.print("*");

            for (int col = 0; col < n * 2 - 2; col++) {
                System.out.print("/");
            }
            System.out.println("*");
        }

//last row
        for (int row = 0; row < n * 2; row++) {
            System.out.print("*");
        }
        for (int row = 0; row < n; row++) {
            System.out.print(" ");
        }
        for (int row = 0; row < n * 2; row++) {
            System.out.print("*");
        }
        System.out.println();
    }
}