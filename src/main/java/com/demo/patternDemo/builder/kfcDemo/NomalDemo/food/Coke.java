package com.demo.patternDemo.builder.kfcDemo.NomalDemo.food;

import com.demo.patternDemo.builder.kfcDemo.NomalDemo.packing.Bottle;
import com.demo.patternDemo.builder.kfcDemo.NomalDemo.packing.Packing;

public class Coke {
    public String name = "Coke";
    //包装
    public Packing pack = new Bottle();
    public double price = 8.8;
}
