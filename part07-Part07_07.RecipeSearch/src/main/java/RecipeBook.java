import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {

    // instance variables
    private ArrayList<ArrayList<String>> recipes;

    // parameter free constructor
    public RecipeBook() {
        // create an arraylist of arraylists of type string
        // this is a recipe book, with recipes made up of rows of strings
        this.recipes = new ArrayList<ArrayList<String>>();
    }

    // import recipes from file and populate recipe book
    public void recipeImport(String filename) {

        try (Scanner filescanner = new Scanner(Paths.get(filename))) {
            
            while(filescanner.hasNextLine()) {
            
                ArrayList<String> recipe = new ArrayList<String>();

                // loop over new recipes inside the recipe file
                while(true) {

                    if (filescanner.hasNextLine()) {
                        String line = filescanner.nextLine();

                        if (!(line.matches(""))) {
                            recipe.add(line);
                            continue;
                        }

                        this.recipes.add(recipe);
                        break;

                    // write the last recipe and break out
                    } else {
                        this.recipes.add(recipe);
                        break;
                    }
                }
            }
        } catch (Exception e) {

        }
    }

    // find name
    public void findRecipeName(String name) {
        System.out.println("Recipes:");
        for (ArrayList<String> recipe : this.recipes) {
            if (recipe.get(0).contains(name)) {
                System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
                
            }
        }
    }

    // find ingredient
    public void findIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (ArrayList<String> recipe : this.recipes) {
            for (int i = 2; i <= recipe.size() - 1; i++) {
                    if (recipe.get(i).equals(ingredient)) {
                    System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
                }
            }
        }
    }

    // find cooking time with a maximum parameter
    public void findCookingTime(String max) {
        System.out.println("Recipes:");
        for (ArrayList<String> recipe : this.recipes) {
            if (Integer.valueOf(recipe.get(1)) <= Integer.valueOf(max)) {
                System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
                
            }
        }
    }

    // list all recipes
    public void listRecipes() {
        System.out.println("Recipes:");
        for (ArrayList<String> recipe : this.recipes) {
            System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
            
        }
    }
}