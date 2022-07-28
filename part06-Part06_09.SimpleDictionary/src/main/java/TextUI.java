import java.util.Scanner;

public class TextUI {
    
    // instance variables
    private Scanner scanner;
    private SimpleDictionary dictionary;

    // constructor
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    // instance methods
    public void start() {

        while(true) {

            System.out.println("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                break;

            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String langWord = this.scanner.nextLine();
                System.out.println("Translation: ");
                String langTranslation = this.scanner.nextLine();

                if (!(langWord.isEmpty() && langTranslation.isEmpty())) {
                    dictionary.add(langWord, langTranslation);
                    continue;

                }

            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String langWord = this.scanner.nextLine();

                if (dictionary.translate(langWord) == null) {
                    System.out.println("Word " + langWord + " was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(langWord));
                    continue;
                }

            } else {
                System.out.println("Unknown command");

            }  
        }
        System.out.println("Bye bye!");

    }
}
