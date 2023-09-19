package com.demo.threadPoolDemo;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws Exception {
        ExecutorService es = new ThreadPoolExecutor(50
                , 100, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                es.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "===>办理业务");
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                    }
                });
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) es);
        while (true) {
            System.out.println();
            int queueSize = tpe.getQueue().size();
            System.out.println("当前排队任务数：" + queueSize);
            int activeCount = tpe.getActiveCount();
            System.out.println("当前活动线程数：" + activeCount);
            long completedTaskCount = tpe.getCompletedTaskCount();
            System.out.println("执行完成任务数：" + completedTaskCount);
            long taskCount = tpe.getTaskCount();
            System.out.println("总任务数：" + taskCount);

            Thread.sleep(5000);
        }
    }
}
