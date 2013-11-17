package com.ericsson.learning.ejb.logic;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(
        activationConfig = {
                @ActivationConfigProperty(
                        propertyName = "destinationName",
                        propertyValue = "jms/OrderBillingQueue"
                )
        }
)
public class OrderBillingMDB implements MessageListener {
    @Override
    public void onMessage(Message message) {
        try {
            ObjectMessage objectMessage = (ObjectMessage) message;
            Order order = (Order) objectMessage.getObject();

            try {
                bill(order);
                notifyBillingSuccess(order);
                order.setStatus(OrderStatus.COMPLETE);
            } catch (BillingException be) {
                notifyBillingFailure(be, order);
                order.setStatus(OrderStatus.BILLING_FAILED);
            } finally {
                update(order);
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    private void bill(Order order) {
        System.out.println("Billing Completed by MDB ..");
        System.out.println("A/c No:"
                + order.getBillingInfo().getAccountNumber() + " charged..");
    }

    private void notifyBillingSuccess(Order order) {

    }

    private void notifyBillingFailure(BillingException be, Order order) {

    }

    private void update(Order order) {

    }
}
