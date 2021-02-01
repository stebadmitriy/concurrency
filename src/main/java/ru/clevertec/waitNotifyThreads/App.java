package ru.clevertec.waitNotifyThreads;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        Thread thread1 = new Thread(() -> account.payPhone());
        Thread thread2 = new Thread(() -> account.payPhone());
        Thread thread3 = new Thread(() -> account.payPhone());
        Thread thread4 = new Thread(() -> account.payPhone());
        Thread thread5 = new Thread(() -> account.payPhone());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        TimeUnit.SECONDS.sleep(1);

        account.receiving(6);
    }
}
