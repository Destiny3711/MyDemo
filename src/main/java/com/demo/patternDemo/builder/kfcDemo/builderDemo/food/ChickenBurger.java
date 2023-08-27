package com.demo.patternDemo.builder.kfcDemo.builderDemo.food;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Packing;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Wrapper;

public class ChickenBurger extends Burger{
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public double price() {
        return 20;
    }
}
