package org.example;

import java.util.Random;

public class Pizza {
    private int id;
    private int price;
    private final static int MIN_PRICE =10;
    private final static int MAX_PRICE=50;
    private final static Random rm= new Random();

    public Pizza(int id){
        setId(id);
        setPrice();
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice() {
        this.price= rm.nextInt(MIN_PRICE, MAX_PRICE)+10;
    }
}
