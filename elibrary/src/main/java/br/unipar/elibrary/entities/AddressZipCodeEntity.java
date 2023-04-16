package br.unipar.elibrary.entities;

import java.util.Objects;

public class AddressZipCodeEntity {
    
    private Long id;
    private String zipCode;
    
    private AddressEntity address;
    
    public AddressZipCodeEntity() { }

    public AddressZipCodeEntity(Long id, String zipCode, AddressEntity address) {
        this.id = id;
        this.zipCode = zipCode;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final AddressZipCodeEntity other = (AddressZipCodeEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
