package Drawing_with_Loops;

public class RectangleOf10x10Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.printf("%n");
        }
    }
}