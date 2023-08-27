package com.demo.patternDemo.singleton;

public class Test {

}

class HungrySing {

    private static HungrySing instance = new HungrySing();

    private HungrySing() {
    }

    public static HungrySing getInstance() {
        return instance;
    }
}


class LazySing {

    private static volatile LazySing instance;

    private LazySing() {
    }

    public static LazySing getInstance() {
        if (instance == null) {
            synchronized (LazySing.class){
                if (instance == null) {
                    instance = new LazySing();
                }
            }
        }
        return instance;
    }
}

class InnerclassSing {

    private static class InnerclassHolder {
        private static InnerclassSing instance = new InnerclassSing();
    }

    private InnerclassSing() {
    }

    public static InnerclassSing getInstance() {
        return InnerclassHolder.instance;
    }
}

enum enumSing {
    INSTANCE;
    public void whateverMethod(){}
}
