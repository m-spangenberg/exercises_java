public class Book {
    // Our instance variables
    private String author;
    private String title;
    private Integer pages;

    // Our constructor
    public Book(String author, String name, int pages) {
        this.title = name;
        this.author = author;
        this.pages = pages;
    }

    // Our instance methods
    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    // Print out book
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pages + " pages"; 
    }

}
