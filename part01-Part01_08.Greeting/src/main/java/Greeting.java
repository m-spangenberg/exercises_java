
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        // Get user input
        String name =  scanner.nextLine();
        // Say hello to the user
        System.out.println("Hi " + name);
        // close scanner
        scanner.close();
    }
}
