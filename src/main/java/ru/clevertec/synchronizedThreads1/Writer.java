package ru.clevertec.synchronizedThreads1;

public class Writer {
    /**
     * Общий ресурс
     */
    private final StringBuffer stringBuilder;

    public Writer(StringBuffer stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void write(String message, int index) {
        stringBuilder
                .append(message)
                .append(": ")
                .append(message)
                .append(" ")
                .append(index)
                .append("\n");
    }
}
