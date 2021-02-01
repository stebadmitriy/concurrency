package ru.clevertec.stateThreads;

public class InThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + " In "+ i);
        }
    }
}
