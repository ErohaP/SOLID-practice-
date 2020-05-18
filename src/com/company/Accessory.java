package com.company;

public class Accessory implements Element {
    private String name;
    private int price;
    public Accessory(int price,String name){
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

    @Override
    public void inhabit() {
        System.out.println("It is "+ getName()+" and it,s just accessory in water.Price: "+getPrice()+"$");
    }
}





