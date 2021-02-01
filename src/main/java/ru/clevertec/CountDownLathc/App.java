package ru.clevertec.CountDownLathc;

import java.util.concurrent.CountDownLatch;

public class App {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        for (int i = 0; i < 6; i++) {
            CustomThread customThread = new CustomThread(countDownLatch);
            customThread.start();
        }

    }
}
