
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get last number from the user
        System.out.println("Give a number: ");
        int factorial = Integer.valueOf(scanner.nextLine());

        int count = 1;
        for (int i = factorial; i > 0; i--) {
            count *= i;
        }

        System.out.println("Factorial: " + count);
    }
}
