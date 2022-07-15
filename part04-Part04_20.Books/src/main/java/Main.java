import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read program information from the user
        while (true) {
            // Get title of book
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();

            // End the data collection when the user enters an empty title
            if (bookTitle.isEmpty()) {
                break;
            }

            // Get page count of book
            System.out.print("Pages: ");
            int bookPageCount = Integer.valueOf(scanner.nextLine());

            // Get publication year of book
            System.out.print("Publication year: ");
            int bookPublicationYear = Integer.valueOf(scanner.nextLine());

            // Add the book to the list of books using the Book class
            books.add(new Book(bookTitle, bookPageCount, bookPublicationYear));
        }

        System.out.print("Program's maximum duration? ");
        String userInputFunctionCall = scanner.nextLine();

        for (Book book : books) {

            if (userInputFunctionCall.equals("everything")) {
                System.out.println(book.everything());
            } else if (userInputFunctionCall.equals("name")) {
                System.out.println(book.name());
            } else {
                // blackhole
            }
        }
    }
}
