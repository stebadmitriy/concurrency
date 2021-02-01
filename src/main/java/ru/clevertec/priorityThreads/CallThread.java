package ru.clevertec.priorityThreads;

import java.util.concurrent.Callable;

public class CallThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread() + " Call " + i);
            builder.append(" Call " + i);
        }
        return builder.toString();
    }
}
