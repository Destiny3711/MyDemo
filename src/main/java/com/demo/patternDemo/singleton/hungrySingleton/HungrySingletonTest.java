package com.demo.patternDemo.singleton.hungrySingleton;

public class HungrySingletonTest {
    public static void main(String[] args) {
        new Thread( ()->{
            HungrySingleton instance = HungrySingleton.getInstance();
            System.out.println(instance);
        }).start();
        new Thread( ()->{
            System.out.println(HungrySingleton.getInstance());
        }).start();
    }
}

