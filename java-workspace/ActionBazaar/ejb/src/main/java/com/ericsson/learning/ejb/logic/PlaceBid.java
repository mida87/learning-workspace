package com.ericsson.learning.ejb.logic;

import com.ericsson.learning.ejb.persistence.Bid;

import javax.ejb.Local;
import javax.ejb.Remote;

@Local
public interface PlaceBid {
    Bid addBid(Bid bid);
}
