package database;

import model.Order;

import java.util.List;

public class OrderDatabase {
    List<Order> orderList;

    public void createOrder(Order order){
        orderList.add(order);
    }
}
