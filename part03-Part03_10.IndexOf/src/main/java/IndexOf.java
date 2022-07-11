
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number

        // search for a given value in the index
        System.out.println("Search for? ");
        int searchValue = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (searchValue == list.get(i)) {
                System.out.println(searchValue + " is at index " + i);
            } else {
                continue;
            }
        }
    }
}
