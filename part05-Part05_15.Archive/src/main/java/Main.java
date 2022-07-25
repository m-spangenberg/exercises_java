import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create an archive list
        ArrayList<Archive> items = new ArrayList<>();
        Scanner idScanner = new Scanner(System.in);
        Scanner nameScanner = new Scanner(System.in);
        
        while (true) {
            // ask for object identifier, if empty: stop.
            System.out.println("Identifier? (empty will stop)");
            String identifier = idScanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            // ask for object name, if empty: stop.
            System.out.println("Name? (empty will stop)");
            String name = nameScanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            // create the archive object and add it to a list
            Archive item = new Archive(identifier, name);

            if (!(items.contains(item))) {
                items.add(item);
            }

        }

        System.out.println("===Items===");
    
        for (Archive item : items) {
            System.out.println(item);
        }

        idScanner.close();
        nameScanner.close();       

    }
}
