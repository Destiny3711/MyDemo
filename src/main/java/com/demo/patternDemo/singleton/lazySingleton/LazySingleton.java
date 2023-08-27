package com.demo.patternDemo.singleton.lazySingleton;

/**
 * 饿汉式单例模式
 *
 * @author syh
 */
public class LazySingleton {
    private volatile static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                    //字节码层
                    //JIT 、 CPU 可能指令重排序
                    // 1、分配空间
                    // 3、引用赋值，线程1赋值完，线程2判断instance != null，直接返回没有初始化的instance
                    // 2、初始化
                }
            }
        }
        return instance;
    }
}
