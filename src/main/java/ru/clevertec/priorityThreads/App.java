package ru.clevertec.priorityThreads;

public class App {
    public static void main(String[] args) {
        InThread inThread = new InThread();
        inThread.setName("inThread");
        inThread.setPriority(Thread.MAX_PRIORITY);


        Thread outThread = new Thread(new OutThread());
        outThread.setName("outThread");
        outThread.setPriority(Thread.MIN_PRIORITY);
        outThread.start();
        inThread.start();

    }
}
