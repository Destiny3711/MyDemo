package com.demo.patternDemo.builder.kfcDemo.NomalDemo.meal;

import com.demo.patternDemo.builder.kfcDemo.NomalDemo.food.ChickenBurger;
import com.demo.patternDemo.builder.kfcDemo.NomalDemo.food.Pepsi;

public class NonVegMeal {
    public ChickenBurger chickenBurger = new ChickenBurger();
    public Pepsi pepsi = new Pepsi();

    public void show() {
        System.out.println(chickenBurger.name + ", Packing : " + chickenBurger.pack.pack() + ", Price : " + chickenBurger.price);
        System.out.println(pepsi.name + ", Packing : " + pepsi.pack.pack() + ", Price : " + pepsi.price);
        System.out.println("Total Cost : " + (chickenBurger.price + pepsi.price));
    }
}
