package com.pb.kozak.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        String sign;
        double result;
        Scanner scan = new Scanner(System.in);


        System.out.println("Ввеите превое целое число");
        operand1 = scan.nextInt();

        System.out.println("Ввеите целое второе число");
        operand2 = scan.nextInt();


        System.out.println("Введите знак ");
        sign = scan.next();


        switch (sign) {
            case "+":
                System.out.println(" Сумма сложения = " + (operand1 + operand2));

                break;
            case "-":
                System.out.println(" разница = " + (operand1 - operand2));

                break;

            case "/":
                if (operand2 == 0) System.out.println("нельзя делить на ноль. Выберите другое число.");

                else
                    System.out.println(" Результат деления = " + ((double)operand1 / (double) operand2));

                break;
            case "*":
                System.out.println(" Результат сложения = " + (operand1 * operand2));

                break;
            default:
                System.out.println("Просили же вводить только знаки");
        }
    }
}



