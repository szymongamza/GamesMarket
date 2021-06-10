package service;

import database.AuctionDatabase;
import model.Auction;

public class AuctionService {
    private AuctionDatabase auctionDatabase;

    public AuctionService(){
        this.auctionDatabase = new AuctionDatabase();
    }

    public void createAuction(Auction auction){
        auctionDatabase.createAuction(auction);
    }

    public Auction getAuction(int id){
        return auctionDatabase.getAuctionById(id);
    }

    public void updateAuction(Auction auction){
        auctionDatabase.updateAuction(auction);
    }

    public void deleteAuction(int id){
        auctionDatabase.deleteAuction(id);
    }
}
