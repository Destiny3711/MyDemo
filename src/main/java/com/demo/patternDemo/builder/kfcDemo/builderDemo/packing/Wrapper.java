package com.demo.patternDemo.builder.kfcDemo.builderDemo.packing;

//用纸盒打包
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "纸盒";
    }
}
