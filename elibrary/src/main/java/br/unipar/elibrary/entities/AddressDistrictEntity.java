package br.unipar.elibrary.entities;

import java.util.Objects;

public class AddressDistrictEntity {
    
    private Long id;
    private String name;
    
    private AddressEntity address;
    
    public AddressDistrictEntity() { }

    public AddressDistrictEntity(Long id, String name, AddressEntity address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final AddressDistrictEntity other = (AddressDistrictEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
