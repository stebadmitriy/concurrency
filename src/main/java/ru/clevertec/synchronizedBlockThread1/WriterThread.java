package ru.clevertec.synchronizedBlockThread1;

public class WriterThread extends Thread {
    private final Writer writer;

    public WriterThread(Writer writer, String name) {
        super(name);
        this.writer = writer;
    }

    @Override
    public void run() {
        writer.write(this.getName());
    }
}
