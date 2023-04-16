package br.unipar.elibrary.entities;

import java.util.HashSet;
import java.util.Set;

public class AuthorEntity extends UserEntity {
    
    private Set<AuthorBookEntity> authorBook = new HashSet<>();

    public AuthorEntity() { }

    public AuthorEntity(Long id, String name) {
        super(id, name);
    }

    public Set<AuthorBookEntity> getAuthorBook() {
        return authorBook;
    }

    public void addAuthorBook(AuthorBookEntity authorBook) {
        this.authorBook.add(authorBook);
    }
}
