package Advanced_Loops;

import java.util.Scanner;

public class NumberInRangeFrom1to100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a valid number in range [1...100]");
            int number = Integer.parseInt(scanner.nextLine());

            if (number >=1 && number <= 100) {
                System.out.println("The number is: " + number);
                break;
            } else {
                System.out.println("Invalid number!");
            }
        }
    }
}
