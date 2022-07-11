
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        // from which number...
        System.out.println("From where?");
        int beginNumber = Integer.valueOf(scanner.nextLine());

        // to which number...
        System.out.println("To where?");
        int endNumber = Integer.valueOf(scanner.nextLine());

        // Use a for loop to move through the list indices.
        for (int i = beginNumber; i <= endNumber; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
