package br.unipar.elibrary.entities;

import br.unipar.elibrary.entities.pks.GenreBookEntityPK;

public class GenreBookEntity {
    
    private GenreBookEntityPK id = new GenreBookEntityPK();
    
    public GenreBookEntity() { }

    public GenreBookEntity(GenreEntity genre, BookEntity book) {
        this.id.setGenre(genre);
        this.id.setBook(book);
    }

    public GenreBookEntityPK getId() {
        return id;
    }

    public void setId(GenreBookEntityPK id) {
        this.id = id;
    }
}
