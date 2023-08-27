package com.demo.patternDemo.builder.kfcDemo.builderDemo.food;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Packing;
import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Wrapper;

public abstract class Burger implements Item{
    @Override
    public Packing pack() {
        return new Wrapper();
    }
}
