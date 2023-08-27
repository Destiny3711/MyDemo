package com.demo.patternDemo.builder.kfcDemo.builderDemo.food;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Bottle;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing pack() {
        return new Bottle();
    }
}
