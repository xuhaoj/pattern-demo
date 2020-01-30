package com.xhj.pattern.singleton.test;

import com.xhj.pattern.singleton.lazy.LazySimpleSingleton;

import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {


    public static void main(String[] args) {

        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);


        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton);
            }

            ).start();
            countDownLatch.countDown();
        }

    }


}