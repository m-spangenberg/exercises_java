
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // First Name
            System.out.println("First name: ");
            String userInputFN = scanner.nextLine();

            if (userInputFN.isEmpty()) {
                break;
            }

            // Last Name
            System.out.println("Last name: ");
            String userInputLN = scanner.nextLine();

            // Identification Number
            System.out.println("Identification number: ");
            String userInputID = scanner.nextLine();

            infoCollection.add(new PersonalInformation(userInputFN, userInputLN, userInputID));
            
            for (PersonalInformation person : infoCollection) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }

    }
}
