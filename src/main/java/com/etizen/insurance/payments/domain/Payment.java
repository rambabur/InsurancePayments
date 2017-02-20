package com.etizen.insurance.payments.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ramab on 2/19/2017.
 */
public class Payment {

    private Date paymentDate; //Default value is: null
    private BigDecimal paymentAmount; //Default null
    private String paymentMethod; //cash,credit card , echeck
    private String paymentStatus; //completed,inprogress,pastdue
    private String paidByUser;
    private String policyNumber;
    private long paymentId; //
    /*
       int - default value = 0
       long - default - 0
       String - null (default value)
       double - 0.0
       float - 0.0F
     */


    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaidByUser() {
        return paidByUser;
    }

    public void setPaidByUser(String paidByUser) {
        this.paidByUser = paidByUser;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", paidByUser='" + paidByUser + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", paymentId=" + paymentId +
                '}';
    }
}
