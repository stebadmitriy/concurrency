package ru.clevertec.synchronizedBlockThread1;

public class Writer {
    /**
     * Общий ресурс
     */
    private final StringBuilder stringBuilder;
    private final Object writeLock = new Object();
    private final Object insertLock = new Object();

    public Writer(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void write(String message) {
        synchronized (writeLock) {
            for (int i = 0; i <= 1000; i++) {
                stringBuilder
                        .append(message)
                        .append(": ")
                        .append(message)
                        .append(" ")
                        .append(i)
                        .append("\n");
            }
        }
    }

    public void insert(String message) {
        synchronized (this) {
            for (int i = 0; i <= 1000; i++) {
                stringBuilder
                        .insert(stringBuilder.length(), message)
                        .insert(stringBuilder.length(), ": ")
                        .insert(stringBuilder.length(), message)
                        .insert(stringBuilder.length(), " ")
                        .insert(stringBuilder.length(), i)
                        .insert(stringBuilder.length(), "\n");
            }
        }
    }


}
