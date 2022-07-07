package com.company;

// HAKAN ÖZCAN - 13253043

public class ThreadClass implements Runnable {
    private int[] array;
    private int min, max;
    private int sum;

    public ThreadClass(int[] array, int min, int max) {
        this.array = array;
        this.min = min;
        this.max = max;
    }

    public int getSum() {
        return sum;
    }

    public void run() {
        this.sum = Islemler.partialSum(array, min, max);
    }
}