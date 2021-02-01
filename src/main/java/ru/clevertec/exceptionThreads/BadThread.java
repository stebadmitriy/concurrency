package ru.clevertec.exceptionThreads;

public class BadThread extends Thread {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
