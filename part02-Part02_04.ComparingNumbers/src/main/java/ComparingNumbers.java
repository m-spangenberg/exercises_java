
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two integers from the user
        int numVar = Integer.valueOf(scanner.nextLine());
        int numVar2 = Integer.valueOf(scanner.nextLine());

        // Do value comparison
        if (numVar > numVar2) {
            System.out.println(numVar + " is greater than " + numVar2 + ".");
        } else if (numVar2 > numVar) {
            System.out.println(numVar + " is smaller than " + numVar2 + ".");
        } else {
            System.out.println(numVar + " is equal to " + numVar2 + ".");
        }

        // Think of the memory! D:
        scanner.close();
    }
}
