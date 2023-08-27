package com.demo.patternDemo.builder.kfcDemo.builderDemo.food;

import com.demo.patternDemo.builder.kfcDemo.builderDemo.packing.Packing;

public interface Item {
    String name();
    Packing pack();
    double price();
}
