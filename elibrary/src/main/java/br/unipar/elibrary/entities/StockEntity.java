package br.unipar.elibrary.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StockEntity {
    
    private Long id;
    private String name;
    
    private Set<ProductEntity> products = new HashSet<>();
    
    public StockEntity() { }

    public StockEntity(Long id, String name) {
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

    public Set<ProductEntity> getProducts() {
        return products;
    }

    public void addProducts(ProductEntity product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "Stock {\n   id = " + id + ",\n   name = " + name + ",\n\n   " + products + "\n}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final StockEntity other = (StockEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
