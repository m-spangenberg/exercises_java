import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {

    // instance variables
    private ArrayList<String> recipes;
    private ArrayList<String> recipe;

    // parameter free constructor
    public RecipeBook() {
        this.recipes = new ArrayList<>();
        this.recipe = new ArrayList<>();
    }

    // import recipes from file and populate recipe book
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

    // find name
    public void findRecipeName(String name) {

    }

    // find ingredient
    public void findIngredient(String ingredient) {

    }

    // find cooking time with a maximum parameter
    public void findCookingTime(String max) {

    }

    // list all recipes
    public void listRecipes() {
        // print each recipe as follows
        // Pancake dough, cooking time: 60
    }
}