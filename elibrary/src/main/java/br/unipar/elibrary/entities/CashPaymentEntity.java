package br.unipar.elibrary.entities;

import java.math.BigDecimal;
import java.time.Instant;

import br.unipar.elibrary.entities.enums.PaymentStatus;

public class CashPaymentEntity extends PaymentEntity {
    
    private BigDecimal change;
    
    public CashPaymentEntity(BigDecimal change) {
        this.change = change;
    }

    public CashPaymentEntity(BigDecimal change, Long id, Instant moment, BigDecimal paidPrice, PaymentStatus status, OrderEntity order) {
        super(id, moment, paidPrice, status, order);
        this.change = change;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Chash Payment { \n  id = " + getId() + ",\n  moment = " + getMoment() + ",\n  paid price = " + getPaidPrice() + "\n  change = " + change + "\n } ";
    }
}
