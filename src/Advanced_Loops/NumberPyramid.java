package Advanced_Loops;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                counter++;
                System.out.print(counter + " ");

                if(counter == n) {
                    break;
                }
            }

            System.out.println();

            if(counter == n) {
                break;
            }
        }
    }
}
