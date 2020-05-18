package com.company;

public abstract class AnimalInWater implements Element {
    private String name;
    private int price;

    public AnimalInWater(String name,int price){
        setName(name);
        setPrice(price);
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
