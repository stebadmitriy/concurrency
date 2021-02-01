package ru.clevertec.exchangerThreads;

import java.time.LocalDateTime;

public class Account {
    private double sum;
    private LocalDateTime updatedDateTime;
    private String description;

    public Account(double sum, LocalDateTime updatedDateTime, String description) {
        this.sum = sum;
        this.updatedDateTime = updatedDateTime;
        this.description = description;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Account{" +
                "sum=" + sum +
                ", updatedDateTime=" + updatedDateTime +
                ", description='" + description + '\'' +
                '}';
    }
}
