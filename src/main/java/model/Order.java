package model;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date createdAt;
    private OrderStatus status;
    private List<Item> games;
    private Address address;

    public Order(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<Item> getGames() {
        return games;
    }

    public void setGames(List<Item> games) {
        this.games = games;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
