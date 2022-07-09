
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVar = Integer.valueOf(scanner.nextLine());

        if (numVar < 0) {
            System.out.println((numVar * -1));
        } else {
            System.out.println(numVar);
        }

        scanner.close();
    }
}
