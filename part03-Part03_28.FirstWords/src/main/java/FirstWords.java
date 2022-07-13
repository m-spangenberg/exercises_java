
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get a string of text form the user
            String userInput = scanner.nextLine();

            if (userInput.matches("")) {
                break;
            } else {
                // If the wordArray contains words
                String wordArray[] = userInput.split(" ");
                System.out.println(wordArray[0]);
            }
        }
    }
}