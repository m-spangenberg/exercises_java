
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask user to input the value of the gift
        System.out.println("Value of gift?");
        Integer valueVar = Integer.valueOf(scan.nextLine());

        // Calculate Finish Gift TAX
        if (valueVar < 5000) {
            System.out.println("No tax!");
        } else if (valueVar < 25000) {
            System.out.println("Tax: " + (100 + ((valueVar - 5000) * 0.08)));
        } else if (valueVar < 55000) {
            System.out.println("Tax: " + (1700 + ((valueVar - 25000) * 0.10)));
        } else if (valueVar < 200000) {
            System.out.println("Tax: " + (4700 + ((valueVar - 55000) * 0.12)));
        } else if (valueVar < 1000000) {
            System.out.println("Tax: " + (22100 + ((valueVar - 200000) * 0.15)));
        } else {
            System.out.println("Tax: " + (142100 + ((valueVar - 1000000) * 0.17)));
        }
    }
}
