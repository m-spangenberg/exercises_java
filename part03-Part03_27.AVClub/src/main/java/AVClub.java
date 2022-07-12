
import java.util.Scanner;

public class AVClub {

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
                        if (word.contains("av")) {
                            System.out.println(word);
                        }
                    }
                }
            }
        }
    }
}
