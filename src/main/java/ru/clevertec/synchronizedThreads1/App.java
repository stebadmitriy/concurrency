package ru.clevertec.synchronizedThreads1;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer();
        Writer writer = new Writer(stringBuilder);

        WriterThread firstWriterThread = new WriterThread("First", writer);
        WriterThread secondWriterThread = new WriterThread("Second", writer);

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
