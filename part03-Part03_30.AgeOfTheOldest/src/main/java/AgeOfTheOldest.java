
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int age = 0;

        while (true) {

            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] inputArray = userInput.split(",");

            age = inputArray.length - 1;

            if (Integer.valueOf(inputArray[age]) > oldest) {
                oldest = Integer.valueOf(inputArray[age]);
            }
            
        }

        System.out.println("Age of the oldest: " + oldest);
    }
}
