package br.unipar.elibrary.entities;

import br.unipar.elibrary.entities.exceptions.IllegalDataException;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class OrderEntity {

    private Long id;
    private Instant moment;
    private BigDecimal discount;

    private UserEntity client;
    private List<PaymentEntity> payments = new ArrayList<>();
    private Set<OrderItemEntity> orderItens = new HashSet<>();

    public BigDecimal getSubTotalPrice() {
        return totalPrice().subtract(discount);
    }
    
    private BigDecimal totalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (OrderItemEntity item : orderItens) {
            total = total.add(item.getSubTotalPrice());
        }
        return total;
    }

    public OrderEntity() { }

    public OrderEntity(Long id, Instant moment, BigDecimal discount, UserEntity client) {
        this.id = id;
        this.moment = moment;
        setDiscount(discount);
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        if (discount.compareTo(BigDecimal.ZERO) < 0 || 
                (!orderItens.isEmpty() && discount.compareTo(totalPrice()) > 0)) {
            throw new IllegalDataException("Valor do desconto inválido!");
        }
        this.discount = discount;
    }

    public UserEntity getClient() {
        return client;
    }

    public void setClient(UserEntity client) {
        this.client = client;
    }

    public List<PaymentEntity> getPayments() {
        return payments;
    }

    public void addPayments(PaymentEntity payment) {
        this.payments.add(payment);
    }

    public Set<OrderItemEntity> getOrderItens() {
        return orderItens;
    }

    public void addOrderItens(OrderItemEntity orderItem) {
        this.orderItens.add(orderItem);
    }

    @Override
    public String toString() {
        return "Order {\n id = " + id + ",\n moment = " + moment + ",\n total price = " + getSubTotalPrice() + "\n discount = " + discount + ",\n\n " + client + ",\n\n " + payments + ", \n\n " + orderItens + "\n }\n}";
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final OrderEntity other = (OrderEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
