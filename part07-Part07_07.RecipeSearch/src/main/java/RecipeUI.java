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
        recipeBook.recipeImport(file);
        System.out.println("");
        
        // list the available commands
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.println("Enter command: ");
            String command = this.scanner.nextLine();

            if (!(command.equals("stop"))) {
                
                switch (command) {
                    case "find cooking time":
                        System.out.println("Max cooking time: ");
                        String searchTime = this.scanner.nextLine();
                        recipeBook.findCookingTime(searchTime);
                        break;
                    case "find name":
                        System.out.println("Searched word: ");
                        String searchName = this.scanner.nextLine();
                        recipeBook.findRecipeName(searchName);
                        break;
                    case "find ingredient":
                        System.out.println("Ingredient: ");
                        String searchIngredient = this.scanner.nextLine();
                        recipeBook.findIngredient(searchIngredient);
                        break;
                    case "list":
                        recipeBook.listRecipes();
                        break;
                    case "stop":
                        break;
                }

            System.out.println("");

            } else {
                break;
            }
        }
    }  
}
