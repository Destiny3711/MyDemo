package com.demo.patternDemo.builder.kfcDemo.NomalDemo.food;

import com.demo.patternDemo.builder.kfcDemo.NomalDemo.packing.Bottle;
import com.demo.patternDemo.builder.kfcDemo.NomalDemo.packing.Packing;

public class Pepsi {
    public String name = "Pepsi";
    //包装
    public Packing pack = new Bottle();
    public double price = 9.9;
}
