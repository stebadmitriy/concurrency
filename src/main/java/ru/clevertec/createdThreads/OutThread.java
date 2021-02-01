package ru.clevertec.createdThreads;

public class OutThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + " Out "+ i);
        }
    }
}
