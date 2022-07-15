
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner0 = new Scanner(System.in);
        System.out.println("Which file should have its contents printed? ");
        String userInput = scanner0.nextLine();

        try (Scanner scanner1 = new Scanner(Paths.get(userInput))) {

            // While there is a next line in the file, read it and print it
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                System.out.println(row);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
