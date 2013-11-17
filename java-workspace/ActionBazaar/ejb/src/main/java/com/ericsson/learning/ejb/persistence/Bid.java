package com.ericsson.learning.ejb.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "BIDS")
public class Bid implements Serializable {

    private Long bidId;
    private Long itemId;
    private Long bidderId;
    private Double bidAmount;
    private Date bidDate;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BID_ID")
    public Long getBidId() {
        return bidId;
    }

    public void setBidId(Long bidId) {
        this.bidId = bidId;
    }

    @Column(name = "ITEM_ID")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @Column(name = "BIDDER_ID")
    public Long getBidderId() {
        return bidderId;
    }

    public void setBidderId(Long bidderId) {
        this.bidderId = bidderId;
    }

    @Column(name = "BID_AMOUNT")
    public Double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(Double bidAmount) {
        this.bidAmount = bidAmount;
    }

    @Column(name = "BID_DATE")
    public Date getBidDate() {
        return bidDate;
    }

    public void setBidDate(Date bidDate) {
        this.bidDate = bidDate;
    }
}
