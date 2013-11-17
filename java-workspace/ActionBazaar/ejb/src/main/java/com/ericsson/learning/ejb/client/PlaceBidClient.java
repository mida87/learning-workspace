package com.ericsson.learning.ejb.client;

import javax.ejb.EJB;
import com.ericsson.learning.ejb.logic.PlaceBid;
import com.ericsson.learning.ejb.persistence.Bid;

public class PlaceBidClient {
    @EJB
    private static PlaceBid placeBid;

    public static void main(String[] args) {
        try {
            Bid bid = new Bid();
            placeBid.addBid(bid);
            System.out.println("Bid successful !");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
