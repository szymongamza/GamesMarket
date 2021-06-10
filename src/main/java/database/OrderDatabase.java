package database;

import model.Item;
import model.Order;

import java.util.List;

public class OrderDatabase {
    private static List<Order> orderList;

    public void createOrder(Order order){
        orderList.add(order);
    }

    public Order getOrderById(int id){
        Order outputOrder = new Order();
        for (Order item : orderList) {
            outputOrder = item;
        }
        return outputOrder;
    }

    public void updateOrder(Order order){
        for(int i=0; i<orderList.size(); i++){
            if(orderList.get(i).getId() == order.getId()) orderList.set(i, order);
        }
    }
}
