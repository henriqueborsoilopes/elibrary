package br.unipar.elibrary.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class BookEntity extends ProductEntity {
    
    private int numPages;
    private Instant release;
    
    private PublisherEntity publisher;
    private Set<AuthorBookEntity> authors = new HashSet<>();
    private Set<GenreBookEntity> genreBooks = new HashSet<>();
    
    public BookEntity() { }

    public BookEntity(int numPages, Instant release, PublisherEntity publisher, Long id, String name, int amount, BigDecimal unitPrice, BigDecimal discount, boolean isSale, StockEntity stock) {
        super(id, name, amount, unitPrice, discount, isSale, stock);
        this.numPages = numPages;
        this.release = release;
        this.publisher = publisher;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Instant getRelease() {
        return release;
    }

    public void setRelease(Instant release) {
        this.release = release;
    }

    public PublisherEntity getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherEntity publisher) {
        this.publisher = publisher;
    }

    public Set<AuthorBookEntity> getAuthors() {
        return authors;
    }

    public void addAuthors(AuthorBookEntity author) {
        this.authors.add(author);
    }

    public Set<GenreBookEntity> getGenreBooks() {
        return genreBooks;
    }

    public void addGenreBooks(GenreBookEntity genreBook) {
        this.genreBooks.add(genreBook);
    }
}
