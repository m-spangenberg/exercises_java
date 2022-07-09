
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int userInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from? ");
        int userInput2 = Integer.valueOf(scanner.nextLine());

        for (int i = userInput2; i <= userInput; i++) {
            System.out.println(i);
        }
    }
}
