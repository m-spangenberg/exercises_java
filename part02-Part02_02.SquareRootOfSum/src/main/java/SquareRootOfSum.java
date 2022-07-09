
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVar = Integer.valueOf(scanner.nextLine());
        int numVar2 = Integer.valueOf(scanner.nextLine());
        double squaredVar = Math.sqrt(numVar + numVar2);
        System.out.println(squaredVar);
    }
}
