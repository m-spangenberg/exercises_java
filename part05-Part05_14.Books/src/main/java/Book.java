
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {

        // compare reference pointers
        if (this == compared) {
            return true;
        }

        // compare types
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert equals Object to Book type
        Book comparedBook = (Book) compared;

        // compare instance variables of book objects
        if (this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        return false;
    }

}
