
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput != 0) {
                count ++;
                continue;
            } else {
                break;
            }
        }

        System.out.println("Number of numbers: " + count);
    }
}
