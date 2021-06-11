package service;

import database.ItemDatabase;
import model.Item;

import java.util.List;

public class ItemService {
    private ItemDatabase itemDatabase;

    public ItemService(){
        this.itemDatabase = new ItemDatabase();
    }

    public void createItem(Item item){
        itemDatabase.createItem(item);
    }

    public Item getItem(int id){
        return itemDatabase.getItemById(id);
    }

    public void updateItem(Item item){
        itemDatabase.updateItem(item);
    }

    public void deleteItem(int id){
        itemDatabase.deleteItem(id);
    }

    public List<Item> searchItems(String data){
        return itemDatabase.searchItems(data);
    }
}
