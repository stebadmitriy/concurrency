package ru.clevertec.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class RepositoryThread extends Thread {
    private final String connection;
    private final Semaphore semaphore;
    private final Repository repository;

    public RepositoryThread(String connection, Semaphore semaphore, Repository repository) {
        this.connection = connection;
        this.semaphore = semaphore;
        this.repository = repository;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getName() + " Wait permission");
            semaphore.acquire();
            System.out.println(this.getName() + " Connection");
            repository.getRecourse().add(connection);
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(this.getName() + " Release permission");
            semaphore.release();
        }
    }
}
