package StrategyPattern;

public class Item {

    private String id;
    private int price;

    public Item(String id, int cost){
        this.id = id;
        this.price = cost;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

}
