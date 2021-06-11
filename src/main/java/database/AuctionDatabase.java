package database;

import model.Auction;

import java.util.ArrayList;
import java.util.List;

public class AuctionDatabase {
    private static List<Auction> auctionList;

    public AuctionDatabase(){
        if (auctionList == null) auctionList = new ArrayList<>();
    }

    public void createAuction(Auction auction){
        auctionList.add(auction);
    }

    public Auction getAuctionById(int id){
        Auction outputAuction = new Auction();
        for(Auction auction : auctionList){
            if(auction.getId() == id) outputAuction = auction;
        }
        return outputAuction;
    }

    public void updateAuction(Auction auction){
        for(int i=0; i<auctionList.size(); i++){
            if(auctionList.get(i).getId() == auction.getId()) auctionList.set(i, auction);
        }
    }

    public void deleteAuction(int id){
        for (int i=0; i<auctionList.size(); i++){
            if(auctionList.get(i).getId() == id) auctionList.remove(i);
        }
    }
}
