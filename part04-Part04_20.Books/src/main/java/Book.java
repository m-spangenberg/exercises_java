public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String bookTitle, int bookPageCount, int bookPublicationYear) {
        this.title = bookTitle;
        this.pages = bookPageCount;
        this.year = bookPublicationYear;
    }

    public String everything() {
        // return all the details
        return this.title + ", " + this.pages + " pages, " + this.year;
    }

    public String name() {
        // return just the titles
        return this.title;
    }
}
