package br.unipar.elibrary.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CountryEntity {
    
    private Long id;
    private String name;
    
    private Set<StateEntity> states = new HashSet<>();
    
    public CountryEntity() { }

    public CountryEntity(Long id, String name) {
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

    public Set<StateEntity> getStates() {
        return states;
    }

    public void addStates(StateEntity state) {
        this.states.add(state);
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final CountryEntity other = (CountryEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
