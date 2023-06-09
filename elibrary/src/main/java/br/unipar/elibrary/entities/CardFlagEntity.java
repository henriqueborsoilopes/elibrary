package br.unipar.elibrary.entities;

import java.util.Objects;

public class CardFlagEntity {
    
    private Long id;
    private String name;
    
    public CardFlagEntity() { }

    public CardFlagEntity(Long id, String name) {
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

    @Override
    public String toString() {
        return "Card Flag {\n   id = " + id + ",\n   name = " + name + "\n  }";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final CardFlagEntity other = (CardFlagEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
