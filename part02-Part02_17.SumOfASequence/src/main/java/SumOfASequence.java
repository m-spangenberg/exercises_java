
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get last number from the user
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        int count = 0;
        // Sum the sequence of a the user's input
        // eg: 6 = {0 + 1 + 2 + 3 + 4 + 5 + 6} == 21
        for (int i = 0; i <= lastNumber; i++) {
            count += i;
        }

        System.out.println("The sum is " + count);
    }
}
