package ru.clevertec.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) {
        List<String> recourse = new ArrayList<>();
        Repository repository = new Repository(recourse);
        Semaphore semaphore = new Semaphore(2);


        RepositoryThread firstRepositoryThread = new RepositoryThread("First", semaphore, repository);
        RepositoryThread secondRepositoryThread = new RepositoryThread("Second", semaphore, repository);
        RepositoryThread thirdRepositoryThread = new RepositoryThread("Third", semaphore, repository);
        RepositoryThread fourthRepositoryThread = new RepositoryThread("Fourth", semaphore, repository);
        RepositoryThread fifthRepositoryThread = new RepositoryThread("Fifth", semaphore, repository);

        firstRepositoryThread.start();
        secondRepositoryThread.start();
        thirdRepositoryThread.start();
        fourthRepositoryThread.start();
        fifthRepositoryThread.start();


    }
}
