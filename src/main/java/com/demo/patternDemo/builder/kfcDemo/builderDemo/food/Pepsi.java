package com.demo.patternDemo.builder.kfcDemo.builderDemo.food;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Bottle;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Packing;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public double price() {
        return 9.9;
    }
}
