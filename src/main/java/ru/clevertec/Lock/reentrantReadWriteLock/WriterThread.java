package ru.clevertec.Lock.reentrantReadWriteLock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriterThread extends Thread {
    private final Writer writer;
    private final ReentrantReadWriteLock lock;

    public WriterThread(String name, Writer writer, ReentrantReadWriteLock lock) {
        super(name);
        this.writer = writer;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.writeLock().lock();
            for (int i = 0; i <= 1000; i++) {
                writer.write(this.getName(), i);
                if (i == 500) {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("Pause write");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("writer unlock");
            lock.writeLock().unlock();
        }

    }
}
