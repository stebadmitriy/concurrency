package ru.clevertec.priorityThreads;

public class InThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread() + " In "+ i);
        }
    }
}
