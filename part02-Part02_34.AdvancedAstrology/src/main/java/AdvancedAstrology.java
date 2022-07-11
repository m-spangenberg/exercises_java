
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        // Print a breakline
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size;
        for (int i = 1; i <= size; i++) {
            spaces--;
            printSpaces(spaces);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spaces = height;
        int branches = 0;
        for (int i = 1; i <= height; i++) {
            spaces--;
            printSpaces(spaces);
            printStars(i + branches);
            branches++;
        }
        
        for (int x = 0; x < 2; x++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
