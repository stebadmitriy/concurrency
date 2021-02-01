package ru.clevertec.Lock.reentrantReadWriteLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        StringBuilder stringBuilder = new StringBuilder();
        Writer writer = new Writer(stringBuilder);

        WriterThread writerThread = new WriterThread("FirstWriter", writer, lock);
        ReadThread readThread1 = new ReadThread("FirstReader", writer, lock);
        ReadThread readThread2 = new ReadThread("SecondReader", writer, lock);
        ReadThread readThread3 = new ReadThread("ThirdReader", writer, lock);

        writerThread.start();
        TimeUnit.SECONDS.sleep(1);
        readThread1.start();
        readThread2.start();
        readThread3.start();
    }
}
