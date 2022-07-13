
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.matches("")) {
                break;
            } else {
                String wordArray[] = userInput.split(" ");
                System.out.println(wordArray[wordArray.length - 1]);
            }
        }
    }
}
