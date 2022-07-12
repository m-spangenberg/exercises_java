
import java.util.Scanner;

public class LineByLine {

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
                if (wordArray.length > 0) {
                    // print out the user's input, one word per line
                    for (String word : wordArray) {
                        System.out.println(word);
                    }
                }
            }
        }
        scanner.close();
    }
}
