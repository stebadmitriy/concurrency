package ru.clevertec.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class InThread extends Thread {
    private BlockingQueue<String> blockingQueue;

    public InThread(BlockingQueue<String> blockingQueue) {
        super("inThread");
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                blockingQueue.put("Number " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
