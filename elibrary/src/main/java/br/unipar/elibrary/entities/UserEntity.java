package br.unipar.elibrary.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UserEntity {
   
    private Long id;
    private String name;
    
    private Set<AddressDetailEntity> addressDetails = new HashSet<>();
    private Set<OrderEntity> orders = new HashSet<>();
    
    public UserEntity() { }

    public UserEntity(Long id, String name) {
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

    public Set<AddressDetailEntity> getAddressDetails() {
        return addressDetails;
    }

    public void addAddressDetails(AddressDetailEntity addressDetail) {
        this.addressDetails.add(addressDetail);
    }

    public Set<OrderEntity> getOrders() {
        return orders;
    }

    public void addOrders(OrderEntity order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "User {\n  id = " + id + ",\n  name = " + name + "\n }";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final UserEntity other = (UserEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
