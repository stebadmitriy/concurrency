package ru.clevertec.synchronizedThreads2;

public class WriterThread extends Thread {
    private final StringBuffer stringBuffer;

    public WriterThread(StringBuffer stringBuilder, String name) {
        super(name);
        this.stringBuffer = stringBuilder;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            stringBuffer
                    .append(this.getName() + ": " + this.getName() + " " + i + "\n");
        }
    }
}
