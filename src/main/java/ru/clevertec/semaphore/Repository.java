package ru.clevertec.semaphore;

import java.util.List;

public class Repository {
    private List<String> recourse;

    public Repository(List<String> recourse) {
        this.recourse = recourse;
    }

    public List<String> getRecourse() {
        return recourse;
    }
}
