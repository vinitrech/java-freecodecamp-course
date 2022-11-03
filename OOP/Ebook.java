package OOP;

public class Ebook extends Book {
    private String format;

    Ebook(String title, String author, String format) {
        super(title, author); // calls the parent's constructor
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
