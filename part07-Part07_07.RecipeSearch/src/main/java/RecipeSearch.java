import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipes = new RecipeBook();
        RecipeUI ui = new RecipeUI(recipes, scanner);
        ui.start();
    }
}
