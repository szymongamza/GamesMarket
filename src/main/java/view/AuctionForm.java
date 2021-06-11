package view;

import model.Auction;

public class AuctionForm {

    private Auction auction;

    public AuctionForm() {
        this.auction = new Auction();
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }
}
