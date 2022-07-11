
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int indexCount = 0;
        int total = 0;
        for (Integer number : list) {
            total += number;
            indexCount++;
        }

        System.out.println("Average: " + (double) total / indexCount);
        
    }
}
