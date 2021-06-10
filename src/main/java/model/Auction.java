package model;

import java.util.Date;

public class Auction {
    private int id;
    private Item item;
    private Date createdAt;
    private Date expireAt;
    private String description;

    public Auction(int id, Item item, Date createdAt, Date expireAt, String description){
        this.id = id;
        this.item = item;
        this.createdAt = createdAt;
        this.expireAt = expireAt;
        this.description = description;
    }

    public Auction(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Date expireAt) {
        this.expireAt = expireAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
