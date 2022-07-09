
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Get age of user
        System.out.println("How old are you?");
        int ageVar = Integer.valueOf(reader.nextLine());

        // Check age of user
        if (ageVar >= 0 && ageVar <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
