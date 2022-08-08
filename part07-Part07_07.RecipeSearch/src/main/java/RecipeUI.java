import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeUI {
    
    // instance variables
    private Scanner scanner;
    private RecipeBook recipeBook;

    // constructor
    public RecipeUI(RecipeBook recipeBook, Scanner scanner) {
       this.scanner = scanner;
       this.recipeBook = recipeBook; 
    }

    // instance methods - main UI loop
    public void start() {

        // ask the user for an input file
        System.out.println("File to read: ");
        String file = this.scanner.nextLine();
        
        // list the available commands
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");

        while (true) {
            System.out.println("Enter command: ");
            int command = this.scanner.nextLine();

            if (!(command.equals("stop"))) {
                //do something;
            } else {
                break;
            }
        }
    }
        
}

// UI
// read recipe file and place it into memory
// a way to retrieve recipes from file...
// File to read: recipes.txt
// a way to store recipes in memory
// RecipeBook.java

// list recipes in the following format...
// Recipes:
// Pancake dough, cooking time: 60
// Meatballs, cooking time: 20
// Tofu rolls, cooking time: 30and stop

// a way to search for recipes based on: name, cooking time, ingredients

// find recipe by name
// Enter command: find name
// Searched word: roll
// Recipes:
// Tofu rolls, cooking time: 30

// Enter command:  stop