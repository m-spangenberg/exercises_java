
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            String command = parts[0];

            switch (command) {
                case "add":
                    if ((!((amount + first) > 100)) && (!(amount < 0))) {
                        first += amount;
                    } else if (amount < 0) {
                        first += 0;
                    } else {
                        first = 100;
                    }
                    break;
                case "move":
                    if ((!((second + amount) > 100)) && (!(first - amount < 0))) {
                        second += amount;
                        first -= amount;
                    } else if (first - amount < 0) {
                        second += first;
                        first = 0;
                    } else if (first == 0) {
                        second += 0;
                        first += 0;
                    } else {
                        second = 100;
                        first = 0;
                    }
                    break;
                case "remove":
                    if ((!(amount > 100)) && (!(second - amount < 0))) {
                        second -= amount;
                    } else {
                        second = 0;
                    }
                    break;
            }
        }
    }
}
