package com.company;

import java.util.Random;


// HAKAN ÖZCAN - 13253043
public class Main {

    public static void main(String[] args) {
       Random random = new Random();
        int[] randomArray = new int[10000];
        for (int i=0; i<randomArray.length; i++) {
            randomArray[i] = random.nextInt();
        }

        System.out.println("Tüm threadlerin toplamı: " +Islemler.topla(randomArray,10));










    }








    }





