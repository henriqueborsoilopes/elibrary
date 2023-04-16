package br.unipar.elibrary.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class GenreEntity {
    
    public Long id;
    private String name;
    
    private Set<GenreBookEntity> genreBooks = new HashSet<>();
    
    public GenreEntity() { }

    public GenreEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<GenreBookEntity> getGenreBooks() {
        return genreBooks;
    }

    public void addGenreBooks(GenreBookEntity genreBook) {
        this.genreBooks.add(genreBook);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GenreEntity other = (GenreEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
