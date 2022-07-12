
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String users[] = {"alex", "sunshine", "emma", "haskell"};

        // Ask the user for their name and password
        System.out.println("Enter username: ");
        String loginName = scanner.nextLine();
        System.out.println("Enter password: ");
        String loginPass = scanner.nextLine();
        boolean loginCookie = false;

        // Check the array for a suitable name and password combination
        // Set the loginCookie to true if login details are found
        for (int i = 0; i < users.length - 1; i++) {
            if (users[i].equals(loginName) && users[i + 1].equals(loginPass)) {
                loginCookie = true;
            }
        }

        // Notify the user that they have successfully logged in
        if (loginCookie == true) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
