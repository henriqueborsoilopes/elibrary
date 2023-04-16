package br.unipar.elibrary.entities.pks;

import br.unipar.elibrary.entities.BookEntity;
import br.unipar.elibrary.entities.UserEntity;
import java.util.Objects;

public class AuthorBookEntityPK {
        
    private UserEntity author;
    private BookEntity book;

    public UserEntity getAuthor() {
        return author;
    }

    public void setAuthor(UserEntity author) {
        this.author = author;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.author);
        hash = 97 * hash + Objects.hashCode(this.book);
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
        final AuthorBookEntityPK other = (AuthorBookEntityPK) obj;
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return Objects.equals(this.book, other.book);
    }
}
