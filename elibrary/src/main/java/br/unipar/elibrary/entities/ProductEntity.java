package br.unipar.elibrary.entities;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductEntity {

    private Long id;
    private String name;
    private int amount;
    private BigDecimal unitPrice;
    private BigDecimal discount;
    private boolean isSale;

    private StockEntity stock;

    public void decreaseAmount(int amount) {
        this.amount -= amount;
    }

    public void increaseAmount(int amount) {
        this.amount += amount;
    }

    public ProductEntity() {
    }

    public ProductEntity(Long id, String name, int amount, BigDecimal unitPrice, BigDecimal discount, boolean isSale, StockEntity stock) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.isSale = isSale;
        this.stock = stock;
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

    public int getAmount() {
        return amount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public boolean isIsSale() {
        return isSale;
    }

    public void setIsSale(boolean isSale) {
        this.isSale = isSale;
    }

    public StockEntity getStock() {
        return stock;
    }

    public void setStock(StockEntity stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product {\n    id = " + id + ",\n    name = " + name + ",\n    quantity = " + amount + "\n   }";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final ProductEntity other = (ProductEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
