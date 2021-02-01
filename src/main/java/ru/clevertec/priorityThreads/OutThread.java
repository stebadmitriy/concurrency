package ru.clevertec.priorityThreads;

public class OutThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread() + " Out "+ i);
        }
    }
}
