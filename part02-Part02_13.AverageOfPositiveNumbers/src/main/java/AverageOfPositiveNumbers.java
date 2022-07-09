
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;

        while (true) {
            System.out.println("Give a number:");
            double userInput = Double.valueOf(scanner.nextLine());
            
            if (userInput > 0) {
                sum += userInput;
                count ++;
                continue;
            } else if (userInput < 0) {
                continue;
            } else {
                break;
            }
        }

        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + (sum / count));
        }
        
        scanner.close();
    }
}
