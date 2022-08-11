import java.util.Scanner;

public class BirdUI {

    // instance variables
    private Scanner scanner;
    private BirdDB birds;

    // constructor
    public BirdUI(BirdDB birds, Scanner scanner) {
       this.scanner = scanner;
       this.birds = birds; 
    }

    // instance methods - main UI loop
    public void start() {

        while (true) {
            System.out.println("? ");
            String command = this.scanner.nextLine();

            if (!(command.equals("Quit"))) {
                
                switch (command) {
                    case "Add":
                        // add common and Latin species name
                        System.out.println("Name: ");
                        String nameCommon = this.scanner.nextLine();
                        System.out.println("Name in Latin: ");
                        String nameLatin = this.scanner.nextLine();
                        this.birds.addBird(nameCommon, nameLatin);
                        break;
                    case "Observation":
                        // tally all valid observations
                        System.out.println("Bird?: ");
                        String nameObserved = this.scanner.nextLine();
                        this.birds.observedBird(nameObserved);
                        break;
                    case "All":
                        // get all birds in the database
                        birds.getBirds();
                        break;
                    case "One":
                        // get details of specific bird
                        System.out.println("Bird?: ");
                        String nameRecall = this.scanner.nextLine();
                        this.birds.getBird(nameRecall);
                        break;
                    case "Quit":
                        break;
                }

            } else {
                break;
            }
        }
    }
}
