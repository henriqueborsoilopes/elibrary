package br.unipar.elibrary.entities;

import br.unipar.elibrary.entities.exceptions.IllegalDataException;
import br.unipar.elibrary.entities.pks.OrderItemEntityPK;
import java.math.BigDecimal;

public class OrderItemEntity {
    
    private OrderItemEntityPK id = new OrderItemEntityPK();
    private int amount;
    private BigDecimal unitPrice;
    private BigDecimal discount;
    private boolean isSale;
    
    public BigDecimal getSubTotalPrice() {
        return totalPrice().subtract(discount);
    }
    
    private BigDecimal totalPrice() {
        return unitPrice.multiply(new BigDecimal(amount));
    }
    
    public OrderItemEntity() { }

    public OrderItemEntity(OrderEntity order, ProductEntity product, BigDecimal unitPrice, int amount, BigDecimal discount, boolean isSale) {
        this.id.setOrder(order);
        this.id.setProduct(product);
        setAmount(amount);
        this.unitPrice = unitPrice;
        setDiscount(discount);
        this.isSale = isSale;
    }

    public OrderItemEntityPK getId() {
        return id;
    }

    public void setId(OrderItemEntityPK id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount <= 0 || amount > id.getProduct().getAmount()) {
            throw new IllegalDataException("Quantidade inválida!");
        }
        this.amount = amount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getDiscount() {
        if (discount.compareTo(new BigDecimal(0.0)) == -1 || discount.compareTo(totalPrice()) == 1) {
            throw new IllegalDataException("Valor do desconto inválido!");
        }            
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

    @Override
    public String toString() {
        return "Order Item {\n  Product {\n   id: " + id.getProduct().getId() + "\n   name: " + id.getProduct().getName() + "\n  },\n  amount = " + amount + ",\n  unit Price = " + unitPrice + ",\n  discount = " + discount + ",\n  total Price = " + getSubTotalPrice() + "\n }";
    }
}
