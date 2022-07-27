
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {

            String itemInList = "";
            String itemsInList = "";

            itemInList += "The collection " + this.name + " has " + this.elements.size() + " element:\n";

            itemsInList += "The collection " + this.name + " has " + this.elements.size() + " elements:\n";

            for (String element : elements) {

                if (this.elements.size() < 2) {
                    itemInList += element;
                } else {
                    itemsInList += element + "\n";
                }
            }

            if (this.elements.size() < 2) {
                return itemInList;
            } else {
                return itemsInList;
            }
            
        }
    }
}
