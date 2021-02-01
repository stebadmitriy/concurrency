package ru.clevertec.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class App {
    private static BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
        InThread inThread = new InThread(blockingQueue);

        OutThread outThread = new OutThread(blockingQueue);



        try {
            inThread.start();
            TimeUnit.SECONDS.sleep(2);;
            System.out.println(blockingQueue);
            outThread.start();

            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(blockingQueue);

    }
}
