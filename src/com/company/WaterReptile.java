package com.company;

public class WaterReptile extends AnimalInWater implements Reptile {

    public WaterReptile(String name,int price) {
        super(name,price);
    }

    @Override
    public void inhabit() {
        alive();
    }

    @Override
    public void eatSmallFish() {
        System.out.println("It is "+ getName()+" and it eats small fishes.Price: "+getPrice()+"$");
    }

    @Override
    public void alive() {
        eatSmallFish();
    }
}
