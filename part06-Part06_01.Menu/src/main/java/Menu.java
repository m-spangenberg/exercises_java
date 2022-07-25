
import java.util.ArrayList;

public class Menu {

    // instance variables for menu object
    private ArrayList<String> meals;

    // constructor creating new menu object
    public Menu() {
        this.meals = new ArrayList<>();
    }

    // add menu items to menu
    public void addMeal(String meal) {

        if (!(meals.contains(meal))) {
            this.meals.add(meal);
        }
    }
    
    // remove menu items from menu
    public void clearMenu() {
        meals.clear();
    }

    // print contents of menu
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

}
