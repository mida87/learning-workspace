package com.ericsson.learning.ejb.logic;


import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class PlaceOrderBeanTest {
    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
                .addClass(PlaceOrder.class)
                .addClass(PlaceOrderBean.class)
                .addClass(BillingInfo.class)
                .addClass(ShippingInfo.class)
                .addClass(Order.class)
                .addAsManifestResource("test-persistence.xml",
                        ArchivePaths.create("persistence.xml"))
                .addAsManifestResource("META-INF/beans.xml",
                        ArchivePaths.create("beans.xml"))
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(jar);
        return jar;
    }

    @Inject
    PlaceOrder placeOrder;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSetBidderId() throws Exception {
        placeOrder.setBidderId(100L);
    }

    @Test
    public void testAddItem() throws Exception {
        placeOrder.addItem(100L);
    }

    @Test
    public void testSetShippingInfo() throws Exception {
        ShippingInfo shippingInfo = new ShippingInfo("Zagrebacka 28", "Sveti Ivan Zelina", "Croatia");
        placeOrder.setShippingInfo(shippingInfo);
    }

    @Test
    public void testSetBillingInfo() throws Exception {
        BillingInfo billingInfo = new BillingInfo("101", "Master", "09/14");
        placeOrder.setBillingInfo(billingInfo);
    }

    @Test
    public void testConfirmOrder() throws Exception {
        Long orderId = placeOrder.confirmOrder();
        System.out.println("Order id is : " + orderId);
        assertEquals(1000l,orderId.longValue());
    }
}
