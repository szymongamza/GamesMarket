package service;

import database.OrderDatabase;
import model.Order;

public class OrderService {
    private OrderDatabase orderDatabase;

    public OrderService(){
        this.orderDatabase = new OrderDatabase();
    }

    public void createOrder(Order order){
        orderDatabase.createOrder(order);
    }

    public Order getOrder(int id){
        return orderDatabase.getOrderById(id);
    }

    public void updateOrder(Order order){
        orderDatabase.updateOrder(order);
    }
}
