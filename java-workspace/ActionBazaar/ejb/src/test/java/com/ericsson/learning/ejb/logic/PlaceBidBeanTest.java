package com.ericsson.learning.ejb.logic;

import com.ericsson.learning.ejb.persistence.Bid;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.sql.Date;

@RunWith(Arquillian.class)
public class PlaceBidBeanTest {
    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
                .addClass(PlaceBid.class)
                .addClass(PlaceBidBean.class)
                .addClass(Bid.class)
                .addAsManifestResource("test-persistence.xml",
                        ArchivePaths.create("persistence.xml"))
                .addAsManifestResource("META-INF/beans.xml",
                        ArchivePaths.create("beans.xml"))
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        return jar;
    }

    @Inject
    PlaceBid placeBid;

    @Test
    public void testAddBid() throws Exception {
        System.out.println("------------------------- testAddBid -------------------------");

        Bid bid = new Bid();
        bid.setItemId(101l);
        bid.setBidderId(201l);
        bid.setBidAmount(24.5);
        java.util.Date utilDate = new java.util.Date();
        Date currDate = new Date(utilDate.getTime());
        bid.setBidDate(currDate);

        Bid persistedBid = placeBid.addBid(bid);
        System.out.println("After persisting bid id is : " + persistedBid.getBidId());
    }
}
