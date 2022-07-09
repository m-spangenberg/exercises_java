
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here

        // Declare and initialize a String variable and pass the user's input to it
        String message = scanner.nextLine();

        // Print message three times!
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

        // Close scanner, pesky memory leaks!
        scanner.close();

    }
}
