package com.demo.patternDemo.singleton.innerclassSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

public class InnerclassSingletonTest {
    public static void main(String[] args) throws Exception, IllegalAccessException {
//        InnerclassSingleton instance1 = InnerclassSingleton.getInstance();
//        System.out.println(instance == instance1);
//        new Thread(() -> {
//            InnerclassSingleton instance3 = InnerclassSingleton.getInstance();
//            System.out.println(instance3);
//        }).start();
//        new Thread(() -> {
//            InnerclassSingleton instance3 = InnerclassSingleton.getInstance();
//            System.out.println(instance3);
//        }).start();

//        Constructor<InnerclassSingleton> declaredConstructor = InnerclassSingleton.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        InnerclassSingleton innerclassSingleton = declaredConstructor.newInstance();
//        System.out.println(innerclassSingleton);
        InnerclassSingleton instance = InnerclassSingleton.getInstance();
//        System.out.println(instance);

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("InnerclassSingletonTest"));
//        oos.writeObject(instance);
//        oos.close();

        //取文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("InnerclassSingletonTest"));
        InnerclassSingleton instance1 = (InnerclassSingleton) ois.readObject();
        System.out.println(instance1 == instance);

    }

}

/**
 * 内部类
 */
class InnerclassSingleton implements Serializable {

    //序列化id
    static final long serialVersionUID = 42L;

    private static class InnerclassHolder {
        private static InnerclassSingleton instance = new InnerclassSingleton();
    }

    private InnerclassSingleton(){}

    public static InnerclassSingleton getInstance(){
        return InnerclassHolder.instance;
    }

    //实现方法解决单例问题
    Object readResolve() throws ObjectStreamException {
        return InnerclassHolder.instance;
    }

}
