
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

    public String longest() {
        // return null if there are no strings
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestString = this.elements.get(0);

        // check all the strings in the list
        for (String element : this.elements) {
            if (element.length() > longestString.length()) {
                longestString = element;
            }
        }

        return longestString;
    }

}
