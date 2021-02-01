package ru.clevertec.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class OutThread extends Thread {
    private BlockingQueue<String> blockingQueue;

    public OutThread(BlockingQueue<String> blockingQueue) {
        super("outThread");
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("take number " + i);
            try {
                blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
