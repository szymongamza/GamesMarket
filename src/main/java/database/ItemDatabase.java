package database;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDatabase {
    private static List<Item> itemList;

    public ItemDatabase(){
        if (itemList == null) itemList = new ArrayList<>();
    }

    public void createItem(Item item){
        itemList.add(item);
    }

    public Item getItemById(int id){
        Item outputItem = new Item();
        for (Item item : itemList) {
            outputItem = item;
        }
        return outputItem;
    }

    public void updateItem(Item item){
        for(int i=0; i<itemList.size(); i++){
            if(itemList.get(i).getId() == item.getId()) itemList.set(i, item);
        }
    }

    public void deleteItem(int id){
        for (int i=0; i<itemList.size(); i++){
            if(itemList.get(i).getId() == id) itemList.remove(i);
        }
    }

    public List<Item> searchItemsByName(String name){
        List<Item> outputList = new ArrayList<>();
        for (Item item : itemList){
            if (item.getName().contains(name)) outputList.add(item);
        }
        return outputList;
    }

    public List<Item> searchItems(String data){
        data = data.toLowerCase();
        List<Item> outputList = new ArrayList<>();
        for (Item item : itemList){
            if (item.getName().contains(data)
                    || item.getGenre().contains(data)
                    || item.getPlatform().name().toLowerCase().contains(data)
                    || item.getYear().contains(data))
                outputList.add(item);
        }
        return outputList;
    }
}
