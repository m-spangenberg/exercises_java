
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Name of the file to be read
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        // Word to search for
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        String placeholder = "";

        // Find word in file
        try (Scanner filescanner = new Scanner(Paths.get(file))) {
            while (filescanner.hasNextLine()) {
                placeholder = filescanner.nextLine();
                if (placeholder.equals(searchedFor)) {
                    break;
                }
            }

            if (placeholder.equals(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        scanner.close();

    }
}
