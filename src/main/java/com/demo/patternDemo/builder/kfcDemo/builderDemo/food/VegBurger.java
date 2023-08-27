package com.demo.patternDemo.builder.kfcDemo.builderDemo.food;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Packing;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Wrapper;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "vegBurger";
    }

    @Override
    public double price() {
        return 10;
    }

}
