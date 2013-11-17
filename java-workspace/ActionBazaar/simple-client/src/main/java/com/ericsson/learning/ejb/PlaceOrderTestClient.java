package com.ericsson.learning.ejb;

import com.ericsson.learning.ejb.logic.BillingInfo;
import com.ericsson.learning.ejb.logic.PlaceOrder;
import com.ericsson.learning.ejb.logic.ShippingInfo;

import javax.ejb.EJB;

public class PlaceOrderTestClient {
    @EJB
    private static PlaceOrder placeOrder;

    public static void main(String[] args) throws Exception {
        System.out.println("Exercising PlaceOrder EJB...");
        placeOrder.setBidderId(100l);
        placeOrder.addItem(100l);
        placeOrder.setShippingInfo(new ShippingInfo("Zagrebacka 28", "Sveti Ivan Zelina", "Croatia"));
        placeOrder.setBillingInfo(new BillingInfo("101", "Master", "09/14"));

        Long orderId = placeOrder.confirmOrder();
        System.out.println("Order confirmation number: " + orderId);
    }
}
