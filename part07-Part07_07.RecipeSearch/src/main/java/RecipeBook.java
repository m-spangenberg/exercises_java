import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {

}

// ingest
// read file from disk
try (Scanner filescanner = new Scanner(Paths.get(file))){
    while (filescanner.hasNextLine()) {
        list.add(filescanner.nextLine());
    }
} catch (Exception e) {
    System.out.println("There was an error: " + e.getMessage());
}