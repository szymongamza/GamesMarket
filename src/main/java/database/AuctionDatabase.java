package database;

import model.Auction;

import java.util.List;

public class AuctionDatabase {
    private static List<Auction> auctionList;

    public void createAuction(Auction auction){
        auctionList.add(auction);
    }
}
