package ru.clevertec.synchronizedBlockThread1;

public class InsertThread extends Thread {
    private final Writer writer;

    public InsertThread(Writer writer, String name) {
        super(name);
        this.writer = writer;
    }

    @Override
    public void run() {
        writer.insert(this.getName());
    }
}
