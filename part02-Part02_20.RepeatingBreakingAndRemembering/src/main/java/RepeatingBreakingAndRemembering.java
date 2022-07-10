
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.println("Give numbers:");

        int count = 0;
        int sum = 0;
        int oddValue = 0;
        int evenValue = 0;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            } else {
                sum += userInput;
                count++;
                if (userInput % 2 == 0) {
                    evenValue++;
                } else {
                    oddValue++;
                }
                continue;
            }
        }

        double average = (double) sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even:" + evenValue);
        System.out.println("Odd: " + oddValue);

        scanner.close();
    }
}
