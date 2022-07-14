import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        Statistics statistics = new Statistics();
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();

        while (true) {
            
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }

            if (userInput %2 == 0) {
                statistics1.addNumber(userInput);
            } else {
                statistics2.addNumber(userInput);
            }

            statistics.addNumber(userInput);

        }


        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics1.sum());
        System.out.println("Sum of odd numbers: " + statistics2.sum());
    }
}