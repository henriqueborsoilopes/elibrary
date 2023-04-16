package br.unipar.elibrary.entities;

import br.unipar.elibrary.entities.pks.AuthorBookEntityPK;

public class AuthorBookEntity {
        
    private AuthorBookEntityPK id = new AuthorBookEntityPK();
    
    public AuthorBookEntity() { }

    public AuthorBookEntity(AuthorEntity author, BookEntity book) {
        this.id.setAuthor(author);
        this.id.setBook(book);
    }

    public AuthorBookEntityPK getId() {
        return id;
    }

    public void setId(AuthorBookEntityPK id) {
        this.id = id;
    }
}
