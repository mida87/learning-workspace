package com.ericsson.learning.ejb.logic;

public class BillingException extends RuntimeException {

    public BillingException() {
    }

    public BillingException(String msg) {
        super(msg);
    }

    public BillingException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public BillingException(Throwable cause) {
        super(cause);
    }
}
