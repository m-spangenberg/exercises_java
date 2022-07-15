import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read program information from the user
        while (true) {
            System.out.print("Name: ");
            String userInputSN = scanner.nextLine();

            if (userInputSN.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int userInputSD = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(userInputSN, userInputSD));
        }

        System.out.print("Program's maximum duration? ");
        int userInputMaxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram tvProgram : programs) {
            if (tvProgram.getDuration() <= userInputMaxDuration) {
                System.out.println(tvProgram);
            }
        }
    }
}
