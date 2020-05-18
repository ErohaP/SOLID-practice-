package com.company;

public class waterCrab extends AnimalInWater implements Crab  {

    public waterCrab(String name, int price) {
        super(name,price);
    }

    @Override
    public void livingOnBottom() {
        System.out.println("It is a "+ getName()+"and it is living on bottom of aquarium. Price: "+getPrice()+"$");
    }

    @Override
    public void inhabit() {
        alive();
    }

    @Override
    public void alive() {
        livingOnBottom();
    }
}
