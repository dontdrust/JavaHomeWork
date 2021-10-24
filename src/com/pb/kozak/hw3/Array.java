package com.pb.kozak.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] array = new int[10];
        int sum = 0;
        int positive = 0;
        boolean sor = false;
        int buf;
        Scanner scan = new Scanner(System.in);



        for (int i = 0; i < 10; i++) {

            System.out.print("Введите число \t");
            array[i] = scan.nextInt();
        }

        System.out.println("ваш  массив чисел\t");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма чисел данного массива \t " + sum);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }
        }
        System.out.println(" положительных чисел \t" + positive);

        while(!sor) {
            sor = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    sor = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}