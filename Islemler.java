package com.company;

// HAKAN ÖZCAN - 13253043

public class Islemler {

    public static int topla(int[] array, int threadCount) {
        int part = array.length / threadCount; //gelen array'i thread sayısına böldük
        ThreadClass[] threadClasses = new ThreadClass[threadCount];
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threadClasses[i] = new ThreadClass(array, i*part, (i+1)*part); //her threadin kendine düşen array uzunluğundaki değerleri hesaplayacağı bölüm
            threads[i] = new Thread(threadClasses[i]); //değerin thread'e aktarımı
            threads[i].start();
            System.out.println("Thread "+(i+1)+" çalıştırıldı");
        }
        try {
            for (Thread t : threads) {
                t.join();
            }
        } catch (Exception e) {}

        int total = 0;
        int index=1;
        for (ThreadClass thread : threadClasses) {
            total += thread.getSum();
            System.out.println("Thread "+index+" toplamı:"+thread.getSum());
            index++;


        }
        return total;
    }


    public static int partialSum(int[] array, int min, int max) {
        int result = 0;
        for (int i = min; i < max; i++) {
            result += array[i];
        }
        return result;
    }
}
