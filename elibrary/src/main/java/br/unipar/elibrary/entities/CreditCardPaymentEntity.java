
package br.unipar.elibrary.entities;

import java.math.BigDecimal;
import java.time.Instant;

import br.unipar.elibrary.entities.enums.PaymentStatus;

public class CreditCardPaymentEntity extends PaymentEntity {
    
    private int installment;
    
    private CardFlagEntity flag;
    
    public CreditCardPaymentEntity() { }

    public CreditCardPaymentEntity(int instalment, CardFlagEntity flag, Long id, Instant moment, BigDecimal paidPrice, PaymentStatus status, OrderEntity order) {
        super(id, moment, paidPrice, status, order);
        this.installment = instalment;
        this.flag = flag;
    }

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    public CardFlagEntity getFlag() {
        return flag;
    }

    public void setFlag(CardFlagEntity flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Credit Card Payment { \n  id = " + getId() + ",\n  moment = " + getMoment() + ",\n  paid price = " + getPaidPrice() +  "\n  installment = " + installment + "\n  " + flag + "\n }";
    }
}
