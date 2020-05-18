package com.company;

public class SmallFish extends AnimalInWater implements Fish {

    public SmallFish(String name,int price){
        super(name,price);

    }
    @Override
    public void inhabit() {
        alive();
    }

    @Override
    public void aliveInWater() {
        System.out.println("It is "+ getName()+" and it,s living in water.Price: "+getPrice()+"$");
    }

    @Override
    public void alive() {
        aliveInWater();
    }
}
