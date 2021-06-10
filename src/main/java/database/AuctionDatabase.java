package database;

import model.Auction;

import java.util.List;

public class AuctionDatabase {
    private List<Auction> auctionList;

    public void createAuction(Auction auction){
        auctionList.add(auction);
    }
}
