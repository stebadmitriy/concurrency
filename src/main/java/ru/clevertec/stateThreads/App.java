package ru.clevertec.stateThreads;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        InThread inThread = new InThread();

        System.out.println(inThread.getState());
        inThread.start();
        System.out.println(inThread.getState());

        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println(inThread.getState());

    }
}
