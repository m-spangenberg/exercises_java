
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask the user for the first number to compare
        System.out.println("Give the first number:");
        int numberOne = Integer.valueOf(scan.nextLine());

        // Ask the user for the second number to compare
        System.out.println("Give the second number:");
        int numberTwo = Integer.valueOf(scan.nextLine());

        // Logic to check for larger number 
        if (numberOne > numberTwo) {
            System.out.println("Greater number is:" + numberOne);
        } else if (numberTwo > numberOne) {
            System.out.println("Greater number is:" + numberTwo);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
