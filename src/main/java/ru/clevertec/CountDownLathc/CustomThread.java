package ru.clevertec.CountDownLathc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CustomThread extends Thread {
    private final CountDownLatch countDownLatch;

    public CustomThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep((long) (Math.random() * 10L));
            System.out.println(this.getName() + " Wait permission");

            countDownLatch.countDown();
            countDownLatch.await();

            System.out.println(this.getName() + " Start run");
            TimeUnit.SECONDS.sleep((long) (Math.random() * 10L));
            System.out.println(this.getName() + " Stop run");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
