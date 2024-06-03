package fr.diginamic.jpa.entities.bibliotheque;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToMany
    @JoinTable(name = "compo",
            joinColumns = @JoinColumn(name = "id_loan", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_book", referencedColumnName = "id")
    )

    private Set<Book> books;

    public Loan() {
        books = new HashSet<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void clearBooks() {
        books.clear();
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
