package com.demo.patternDemo.builder.kfcDemo.NomalDemo.meal;

import com.demo.patternDemo.builder.kfcDemo.NomalDemo.food.Coke;
import com.demo.patternDemo.builder.kfcDemo.NomalDemo.food.VegBurger;

public class VegMeal {
    public VegBurger vegBurger = new VegBurger();
    public Coke coke = new Coke();

    public void show() {
        System.out.println(vegBurger.name + ", Packing : " + vegBurger.pack.pack() + ", Price : " + vegBurger.price);
        System.out.println(coke.name + ", Packing : " + coke.pack.pack() + ", Price : " + coke.price);
        System.out.println("Total Cost : " + (vegBurger.price + coke.price));
    }
}
