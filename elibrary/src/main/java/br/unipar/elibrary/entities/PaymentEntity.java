package br.unipar.elibrary.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

import br.unipar.elibrary.entities.enums.PaymentStatus;

public class PaymentEntity {
    
    private Long id;
    private Instant moment;
    private BigDecimal paidPrice;
    private Integer status;
    
    private OrderEntity order;
    
    public PaymentEntity() { }

    public PaymentEntity(Long id, Instant moment, BigDecimal paidPrice, PaymentStatus status, OrderEntity order) {
        this.id = id;
        this.moment = moment;
        this.paidPrice = paidPrice;
        this.status = status.getCode();
        this.order = order;
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

    public BigDecimal getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(BigDecimal paidPrice) {
        this.paidPrice = paidPrice;
    }

    public PaymentStatus getStatus() {
		return PaymentStatus.toEnum(status);
	}

	public void setStatus(PaymentStatus status) {
		this.status = status.getCode();
	}

	public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Payment { \n  id = " + id + ",\n  moment = " + moment + "\n }";
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final PaymentEntity other = (PaymentEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
