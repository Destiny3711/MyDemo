package com.demo.patternDemo.builder.kfcDemo.NomalDemo.food;

import com.demo.patternDemo.builder.kfcDemo.NomalDemo.packing.Packing;
import com.demo.patternDemo.builder.kfcDemo.NomalDemo.packing.Wrapper;

public class VegBurger {
    public String name = "VegBurger";
    //包装
    public Packing pack = new Wrapper();
    public double price = 10;
}
