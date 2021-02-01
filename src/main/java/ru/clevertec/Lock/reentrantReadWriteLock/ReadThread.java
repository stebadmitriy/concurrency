package ru.clevertec.Lock.reentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadThread extends Thread {
    private final Writer writer;
    private final ReentrantReadWriteLock lock;

    public ReadThread(String name, Writer writer, ReentrantReadWriteLock lock) {
        super(name);
        this.writer = writer;
        this.lock = lock;
    }

    @Override
    public void run() {
        if (lock.isWriteLocked()) {
            System.out.println("Busy for reading. Recording in progress");
        }
        try {
            lock.readLock().lock();
            writer.read(this.getName());
        } finally {
            lock.readLock().unlock();
        }

    }
}
