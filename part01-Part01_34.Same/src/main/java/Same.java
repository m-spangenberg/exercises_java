
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask our user for two words
        System.out.println("Enter the first string:");
        String wordOne = scan.nextLine();

        System.out.println("Enter the second string:");
        String wordTwo = scan.nextLine();
        
        if (wordOne.equals(wordTwo)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        scan.close();
    }
}
