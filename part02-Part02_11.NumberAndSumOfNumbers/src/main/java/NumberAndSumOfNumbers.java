
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput != 0) {
                sum += userInput;
                count ++;
                continue;
            } else {
                break;
            }
        }

        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}
