package Complex_Conditions;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();

        boolean fruit = item.equals("banana") || item.equals("apple") || item.equals("kiwi")
                || item.equals("cherry") || item.equals("lemon") || item.equals("grapes");

        boolean vegetable = item.equals("tomato") || item.equals("cucumber") || item.equals("pepper") || item.equals("carrot");

        if (fruit) {
            System.out.println("fruit");
        } else if (vegetable) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
