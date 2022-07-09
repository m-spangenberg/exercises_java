
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String message = scanner.nextLine();
        System.out.println(message);

        /* The object `scanner` of type Scanner must
        be closed in order to prevent a memory leak */
        scanner.close();

    }
}
