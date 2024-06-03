package fr.diginamic.jpa.entities.bibliotheque;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @ManyToMany
    @JoinTable(name = "compo",
            joinColumns = @JoinColumn(name = "id_book", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_loan", referencedColumnName = "id")
    )

    private Set<Loan> loans;

    public Book() {
        loans = new HashSet<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public Set<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Set<Loan> loans) {
        this.loans = loans;
    }
}
