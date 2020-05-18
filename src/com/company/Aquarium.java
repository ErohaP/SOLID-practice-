package com.company;
import java.util.ArrayList;
import java.util.List;

public class Aquarium implements PriceOfElements {
   private List<Element> elements;
   private int price ;
   private int totalPrice = 0;
   public Aquarium(){
       elements = new ArrayList<>();
   }
   public void AddElement(Element element) {
        elements.add(element);
   }
   public void start(){
       elements.forEach(e->e.inhabit());

   }
    public int totalPrice() {
        for (Element i : elements
        ) {
        totalPrice+=i.getPrice();
        }
        return totalPrice;
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

