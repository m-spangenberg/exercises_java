
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get a year from the user
        System.out.println("Give a year:");
        Integer yearVar = Integer.valueOf(scan.nextLine());

        // Check whether the year is a leap-year or not
        if (yearVar % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (yearVar % 100 == 0 && yearVar % 400 != 0) {
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year.");
        }

        scan.close();
    }
}
