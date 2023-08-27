package com.demo.patternDemo.builder.kfcDemo.NomalDemo.food;

import com.demo.patternDemo.builder.kfcDemo.NomalDemo.packing.Packing;
import com.demo.patternDemo.builder.kfcDemo.NomalDemo.packing.Wrapper;

public class ChickenBurger {
    public String name = "ChickenBurger";
    //包装
    public Packing pack = new Wrapper();
    public double price = 20;
}
