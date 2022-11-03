package OOP;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vinicius", "1998-04-22");
        Book book = new Book("Title", "Author");
        Ebook ebook = new Ebook("Ebook", "Author", "PDF");

        user.setName("Vinicius updated");
        user.setBirthDate("1998-04-23");

        book.setTitle("Title updated");
        book.setAuthor("Author updated");

        user.borrow(book);

        System.out.println(book.toString());
        System.out.println(ebook.toString() + " - Format: " + ebook.getFormat());

        System.out.printf("%s is %s years old\n", user.getName(), user.getBirthDate());
        System.out.printf("%s has borrowed %s books\n", user.getName(), user.borrowedBooks());
    }
}
