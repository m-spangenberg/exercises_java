import java.util.Scanner;

public class UserInterface {

    // instance variables
    private Scanner scanner;
    private TodoList list;

    // constructor
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    // instance method
    public void start() {

        while(true) {

            System.out.println("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String addTask = this.scanner.nextLine();

                if (!(addTask.isEmpty())) {
                    this.list.add(addTask);
                    continue;
                }

            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int removeTask = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(removeTask);
                continue;
            
            } else if (command.equals("list")) {
                this.list.print();
                continue;

            } else {
                System.out.println("Unknown command");

            }
        }
    }
}
