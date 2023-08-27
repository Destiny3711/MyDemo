package com.demo.patternDemo.singleton.lazySingleton;

import java.lang.reflect.Constructor;

public class LazySingletonTest {
    public static void main(String[] args) throws Exception{
//        new Thread( ()->{
//            LazySingleton instance = LazySingleton.getInstance();
//            System.out.println(instance);
//        }).start();
//        new Thread( ()->{
//            System.out.println(LazySingleton.getInstance());
//        }).start();

        //反射
        Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton lazySingleton = constructor.newInstance();
//        System.out.println(LazySingleton.instance);

//        LazySingleton lazySingleton1 = LazySingleton.getInstance();
//        System.out.println(lazySingleton1 == lazySingleton);
    }

}
