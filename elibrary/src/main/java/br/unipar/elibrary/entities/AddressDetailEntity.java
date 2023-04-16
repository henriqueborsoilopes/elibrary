package br.unipar.elibrary.entities;

import java.util.Objects;

public class AddressDetailEntity {
    
    private Long id;
    private int number;
    private String complement;
    
    private UserEntity user;
    private AddressEntity address;
    
    public AddressDetailEntity() { }

    public AddressDetailEntity(Long id, int number, String complement, UserEntity user, AddressEntity address) {
        this.id = id;
        this.number = number;
        this.complement = complement;
        this.user = user;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final AddressDetailEntity other = (AddressDetailEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
