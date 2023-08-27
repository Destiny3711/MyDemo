package com.demo.patternDemo.builder.kfcDemo.builderDemo.food;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Bottle;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Packing;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public double price() {
        return 8.8;
    }
}
