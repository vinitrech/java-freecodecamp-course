package OOP;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name; // initialized with null as default
    private LocalDate birthDate; // initialized with null as default
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = LocalDate.parse(birthDate);
    }

    public int getBirthDate() {
        Period birthDate = Period.between(this.birthDate, LocalDate.now());

        return birthDate.getYears();
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

    public void borrow(Book book) {
        this.books.add(book);
    }
}
