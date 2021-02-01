package ru.clevertec.Lock.reentrantReadWriteLock;

public class Writer {
    /**
     * Общий ресурс
     */
    private final StringBuilder stringBuilder;

    public Writer(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
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

    public void read(String threadName) {
        System.out.println(threadName + ": Current state is " + stringBuilder.toString() + "END");
    }

}
