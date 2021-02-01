package ru.clevertec.synchronizedBlockThread1;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Writer writer = new Writer(stringBuilder);
        WriterThread writerThread = new WriterThread(writer, "Writer");
        InsertThread insertThread = new InsertThread(writer, "Insert");

        writerThread.start();
        insertThread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuilder);
    }
}
