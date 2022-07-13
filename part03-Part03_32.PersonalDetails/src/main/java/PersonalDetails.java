
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameValue = 0;
        int birthyear = 0;
        int birthyearTotal = 0;
        int personCount = 0;
        String currentName = "";
        String longestName = "";

        while (true) {

            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] inputArray = userInput.split(",");

            // Tally the people and their birthyears so we can find the average
            birthyear = inputArray.length - 1;
            birthyearTotal += Integer.valueOf(inputArray[birthyear]);
            personCount++;

            // Find the longest name
            currentName = inputArray[birthyear - 1];

            if (currentName.length() > nameValue) {
                longestName = inputArray[birthyear - 1];
                nameValue = currentName.length();
            }

        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) birthyearTotal / personCount));
    }
}
