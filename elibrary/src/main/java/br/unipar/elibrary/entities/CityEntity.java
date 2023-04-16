package br.unipar.elibrary.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CityEntity {
        
    private Long id;
    private String name;
    
    private StateEntity state;
    private Set<AddressEntity> addresses = new HashSet<>();
    
    public CityEntity() { }

    public CityEntity(Long id, String name, StateEntity state) {
        this.id = id;
        this.name = name;
        this.state = state;
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

    public StateEntity getState() {
        return state;
    }

    public void setState(StateEntity state) {
        this.state = state;
    }

    public Set<AddressEntity> getAddresses() {
        return addresses;
    }

    public void addAddresses(AddressEntity address) {
        this.addresses.add(address);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final CityEntity other = (CityEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
