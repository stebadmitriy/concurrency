package ru.clevertec.createdThreads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) {
//        InThread inThread = new InThread();
//        inThread.setName("goThread");
//        inThread.start();
//
//
//        Thread outThread = new Thread(new OutThread());
//        outThread.setName("outThread");
//        outThread.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(new CallThread());



        try {
            String s = future.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
