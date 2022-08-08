import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {

    // instance variables
    

    // constructor
    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    // class method - import recipes from file
    public static void recipeImport(String filename) {
        ArrayList<String> list = new ArrayList<>();

        try (Scanner filescanner = new Scanner(Paths.get(filename))){
            while (filescanner.hasNextLine()) {
                list.add(filescanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("There was an error reading the file: " + e.getMessage());
        }
    }

}