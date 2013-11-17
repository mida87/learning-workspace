package com.ericsson.learning.ejb.logic;

import com.ericsson.learning.ejb.persistence.Bid;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PlaceBidBean implements PlaceBid {
    @PersistenceContext(unitName = "actionBazaar")
    private EntityManager entityManager;

    @Override
    public Bid addBid(Bid bid) {
        System.out.println("Adding bid, bidderId = " + bid.getBidderId() + " , itemId = " + bid.getItemId() +
                " , bid ammount = " + bid.getBidAmount() + ".");

        return save(bid);
    }

    private Bid save(Bid bid) {
        entityManager.persist(bid);
        return bid;
    }
}
