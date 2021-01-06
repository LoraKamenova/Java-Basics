package Advanced_Loops;

import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number % 2 == 0) {
                    System.out.println("Even number entered: " + number);
                    break;
                } else {
                    System.out.println("The number is not even ");
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }
    }
}