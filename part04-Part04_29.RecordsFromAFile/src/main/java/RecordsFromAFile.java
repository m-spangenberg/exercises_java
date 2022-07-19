// import libraries needed to accept user input and read file paths.
import java.nio.file.Paths;
import java.util.Scanner;

// create the class entrypoint for our code
public class RecordsFromAFile {

    // create the main method entrypoint for this class
    // this allows us to execute the contents of the class
    public static void main(String[] args) {
        
        // inputScanner is declared and initialized with an instance of Scanner
        Scanner inputScanner = new Scanner(System.in);
        // print out to the terminal asking for the name of the file.
        System.out.println("Name of the file: ");
        // declare variable of type String and initialize with method nextLine.
        String file = inputScanner.nextLine();

        // fileScanner is declared and initialized with an instance of Scanner
        // which itself is initialized by using a method of Paths to get the file path
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            // while there are rows of text in the file do the following
            while (fileScanner.hasNextLine()) {
                
                // for every row of text pass that row to a variable called line
                String line = fileScanner.nextLine();

                // declare a variable called peopleArray of type Array that holds strings.
                // then pass in each row split by a comma
                String[] peopleArray = line.split(",");

                // declare a variable of type String and initialize with index position 0 of peopleArray to it.
                String name = peopleArray[0];
                // declare a variable of type Integer and initialize with index position 1 of peopleArray to it.
                int age = Integer.valueOf(peopleArray[1]);

                // print the name and age of the people from the peopleArray
                System.out.println(name + ", age: " + age + " years");
                }
            
            // when encountering an error, instantiate a variable `e` of type Exception from the Exception class.
            } catch (Exception e) {
                System.out.println("File cannot be read.");
            }
        }
    }
