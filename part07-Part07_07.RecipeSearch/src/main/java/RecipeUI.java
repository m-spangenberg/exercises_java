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
        recipeBook.ingest(file);
        
        // list the available commands
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command: ");
            String command = this.scanner.nextLine();

            if (!(command.equals("stop"))) {
                
                switch (command) {
                    case "find cooking time":
                        System.out.println("Max cooking time: ");
                        String searchTime = this.scanner.nextLine();
                        // Recipes:
                        // Meatballs, cooking time: 20
                        // Tofu rolls, cooking time: 30
                        break;
                    case "find name":
                        System.out.println("Searched word: ");
                        String searchName = this.scanner.nextLine();
                        // Recipes:
                        // Tofu rolls, cooking time: 30
                        break;
                    case "find ingredient":
                        System.out.println("Ingredient: ");
                        String searchIngredient = this.scanner.nextLine();
                        // Recipes:
                        // Pancake dough, cooking time: 60
                        // Meatballs, cooking time: 20
                        break;
                    case "list":
                        // Recipes:
                        // Pancake dough, cooking time: 60
                        // Meatballs, cooking time: 20
                        // Tofu rolls, cooking time: 30
                        break;
                    case "stop":
                        break;
                }

            } else {
                break;
            }
        }
    }
        
}
