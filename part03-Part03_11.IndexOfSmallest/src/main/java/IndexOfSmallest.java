
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create new array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // implement here a program that reads user input
        while (true) {
            int userNumber = Integer.valueOf(scanner.nextLine());

            // until the user enters 9999
            if (userNumber == 9999) {
                break;
            }

            // add numbers to array list
            numbers.add(userNumber);
        }

        // find the smallest number in the array list
        int smallestNumber = numbers.get(numbers.size() - 1);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallestNumber){
                smallestNumber = numbers.get(i);
            }
        }

        // after that, the program prints the smallest number
        System.out.println("Smallest number: " + smallestNumber);
        // and its index -- the smallest number
        // might appear multiple times
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallestNumber) {
                System.out.println("Found at index: " + i);
            }
        }

        
    }
}
