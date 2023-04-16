package br.unipar.elibrary.entities;

import java.math.BigDecimal;
import java.time.Instant;

public class DebitCardPaymentEntity extends PaymentEntity {
    
    private CardFlagEntity flag;
    
    public DebitCardPaymentEntity() { }

    public DebitCardPaymentEntity(CardFlagEntity flag, Long id, Instant moment, BigDecimal paidPrice, OrderEntity order) {
        super(id, moment, paidPrice, order);
        this.flag = flag;
    }

    public CardFlagEntity getFlag() {
        return flag;
    }

    public void setFlag(CardFlagEntity flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Debit Card Payment { \n  id = " + getId() + ",\n  moment = " + getMoment() + ",\n  paid price = " + getPaidPrice() +  "\n  " + flag + "\n }";
    }
}
