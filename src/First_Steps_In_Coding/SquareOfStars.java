package First_Steps_In_Coding;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  = Integer.parseInt(scanner.nextLine());

        String str = "*";

        System.out.println(str.repeat(num));

        for (int i = 0; i < num - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < num-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println(str.repeat(num));
    }
}
