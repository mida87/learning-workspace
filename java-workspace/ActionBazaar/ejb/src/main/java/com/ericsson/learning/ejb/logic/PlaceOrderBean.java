package com.ericsson.learning.ejb.logic;

import javax.annotation.Resource;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.jms.*;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class PlaceOrderBean implements PlaceOrder {
    /*@Resource(name = "jms/QueueConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(name = "jms/OrderBillingQueue", mappedName = "OrderBillingQueue")
    private Destination billingQueue;*/

    private Long bidderId;
    private List<Long> items;
    private ShippingInfo shippingInfo;
    private BillingInfo billingInfo;

    public PlaceOrderBean() {
        this.items = new ArrayList<Long>();
    }

    @Override
    public void setBidderId(Long bidderId) {
        this.bidderId = bidderId;
    }

    @Override
    public void addItem(Long itemId) {
        this.items.add(itemId);
    }

    @Override
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @Override
    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }

    @Override
    @Remove
    public Long confirmOrder() {
        Order order = new Order();
        order.setBidderId(this.bidderId);
        order.setItems(this.items);
        order.setShippingInfo(this.shippingInfo);
        order.setBillingInfo(this.billingInfo);

        saveOrder(order);
        //billOrder(order);

        return order.getOrderId();
    }

    private void saveOrder(Order order) {
        // TODO: persist order into DB
    }

    private void billOrder(Order order) {
        try {
            /*// JMS setup code
            Connection connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producer = session.createProducer(billingQueue);

            // Creates and sends message
            ObjectMessage message = session.createObjectMessage();
            message.setObject(order);
            producer.send(message);

            // Release of JMS resources
            producer.close();
            session.close();
            connection.close();*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
