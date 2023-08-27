package com.demo.patternDemo.singleton.enumSingleton;

import java.lang.reflect.Constructor;

enum EnumSingleton{
    INSTANCE;

}
public class EnumSingletonTest {
    public static void main(String[] args) throws Exception {
//        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
//        System.out.println(instance == instance2);
        Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumSingleton instance = constructor.newInstance();
        System.out.println(instance == instance2);
    }
}
