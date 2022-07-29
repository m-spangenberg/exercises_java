import java.util.Scanner;

public class UserInterface {
     
    // instance variables
    private Scanner scanner;
    private JokeManager jokes;

    // constructor
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.jokes = manager;
    }

    // instance methods
    public void start() {

        System.out.println("What a joke!");

        while (true) {

            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = this.scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = this.scanner.nextLine();
                    this.jokes.addJoke(joke);
                    break;
                case "2":
                    System.out.println("Drawing a joke.");
                    System.out.println(this.jokes.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    this.jokes.printJokes();
                case "X":
                    break;
            }

            if (!(command.equals("X"))) {
                continue;
            } else {
                break;
            }
        }
    }
}
