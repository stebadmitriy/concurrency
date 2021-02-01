package ru.clevertec.synchronizedThreads1;

public class WriterThread extends Thread {
    private final Writer writer;

    public WriterThread(String name, Writer writer) {
        super(name);
        this.writer = writer;

    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            writer.write(this.getName(), i);
        }
    }
}
