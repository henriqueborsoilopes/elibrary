package br.unipar.elibrary.entities.pks;

import br.unipar.elibrary.entities.GenreEntity;
import br.unipar.elibrary.entities.BookEntity;
import java.util.Objects;

public class GenreBookEntityPK {
    
    private BookEntity book;
    private GenreEntity genre;

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public GenreEntity getGenre() {
        return genre;
    }

    public void setGenre(GenreEntity genre) {
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.book);
        hash = 67 * hash + Objects.hashCode(this.genre);
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
        final GenreBookEntityPK other = (GenreBookEntityPK) obj;
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        return Objects.equals(this.genre, other.genre);
    }
}
