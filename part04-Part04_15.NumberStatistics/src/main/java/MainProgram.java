import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        Statistics statistics = new Statistics();

        while (true) {
            
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }

            statistics.addNumber(userInput);

        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: "
        System.out.println("Sum of odd numbers: "
    }
}