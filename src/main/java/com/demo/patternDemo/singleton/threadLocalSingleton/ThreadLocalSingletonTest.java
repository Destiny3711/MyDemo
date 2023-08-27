package com.demo.patternDemo.singleton.threadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        new Thread(() -> {
            ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
            System.out.println(instance);
        }).start();
    }
}

class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
