package com.demo.patternDemo.singleton.hungrySingleton;

/**
 * 饿汉式
 *
 * @author syh
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
