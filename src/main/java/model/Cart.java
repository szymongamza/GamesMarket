package model;

import java.util.List;

public class Cart {
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    private List<Item> itemList;

    public Cart() {

    }
}
