
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int lineValue = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner filescanner = new Scanner(Paths.get(file))) {
            while (filescanner.hasNextLine()) {

                lineValue = Integer.valueOf(filescanner.nextLine());

                if (lineValue <= upperBound && lineValue >= lowerBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("File cannot be read.");
        }
        
        System.out.println("Numbers: " + count);
        scanner.close();
    }

}
