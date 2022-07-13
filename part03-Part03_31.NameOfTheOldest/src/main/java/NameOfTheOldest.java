
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int age = 0;
        String name = "";

        while (true) {

            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] inputArray = userInput.split(",");

            age = inputArray.length - 1;

            if (Integer.valueOf(inputArray[age]) > oldest) {
                oldest = Integer.valueOf(inputArray[age]);
                name = String.valueOf(inputArray[age - 1]);
            }
            
        }

        System.out.println("Name of the oldest: " + name);

    }
}
