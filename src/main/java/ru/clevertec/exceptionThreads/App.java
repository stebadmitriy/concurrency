package ru.clevertec.exceptionThreads;

public class App {
    public static void main(String[] args) {

        BadThread badThread = new BadThread();
        badThread.start();

        System.out.println("Main thread has been ended");
    }
}
