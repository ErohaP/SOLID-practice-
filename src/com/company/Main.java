package com.company;

public class Main {
    public static void main(String[] args) {
	    Aquarium aquarium = new Aquarium();
	    aquarium.AddElement(new SmallFish("Clownfish",20));
		aquarium.AddElement(new waterCrab("Crustacea",80));
		aquarium.AddElement(new WaterReptile("Turtle",120));
		aquarium.start();
		System.out.println("Total price: "+aquarium.totalPrice()+"$");

    }
}
