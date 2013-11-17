package com.ericsson.learning.ejb.logic;

import java.io.Serializable;

public class BillingInfo implements Serializable {

    protected String accountNumber;

    protected String creditCardType;

    protected String expiryDate;

    public BillingInfo(String accountNumber, String creditCardType, String expiryDate) {
        this.accountNumber = accountNumber;
        this.creditCardType = creditCardType;
        this.expiryDate = expiryDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
