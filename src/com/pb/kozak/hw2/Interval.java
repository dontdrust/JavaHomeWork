package com.pb.kozak.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {

        int a, b, c, d, e, f;
        b = 0;
        c = 15;
        d = 36;
        e = 51;
        f = 100;

        Scanner scan = new Scanner(System.in);


        System.out.println("Введите целое число в промежутке от 0 до 100");
        a = scan.nextInt();
        if (a >= b & a < c) {
            System.out.println("Введенное число попадает в промежуток от 1 до 14");
        } else {
            if (a >= c & a < d) {
                System.out.println("Введенное число попадает в промежуток от 15 до 35");
            } else {
                if (a >= d & a < e) {
                    System.out.println("Введенное число попадает в промежуток от 36 до 50");
                } else {
                    if (a >= e & a < f) {
                        System.out.println("Введенное число попадает в промежуток от 51 до 100");
                    } else {
                        System.out.println("Введенное число не соответствует условиям. Будьте внимательнее");
                    }

                }
            }
        }
    }
}


