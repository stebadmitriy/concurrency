package ru.clevertec.synchronizedThreads2;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer();

        WriterThread firstWriterThread = new WriterThread(stringBuilder, "First");
        WriterThread secondWriterThread = new WriterThread(stringBuilder, "Second");

        firstWriterThread.start();
        secondWriterThread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuilder.toString());
    }
}
