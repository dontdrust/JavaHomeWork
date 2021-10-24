package com.pb.kozak.hw3;

import javafx.scene.SubScene;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random(); //класс рандом

        int Number;
        int R = random.nextInt(101);
        int attemp; // число попыток


        System.out.println("Если вы хотите сыграть, введите целое число в промежутке от 0 до 100. ");
        System.out.println("Для выхода введите 101");
        Scanner in = new Scanner(System.in);// класс для ввода
        Number = in.nextInt(); // присваваем переменной значение введенное с клавиатуры

        for (attemp = 1; Number != R ; attemp++)


        {if (Number == 101){

            break;
        }

                    if (Number > R) {
                        System.out.println("Число больше загаданного, попробуйте еще");
                        Number = in.nextInt();
                    } else {
                        if (Number < R) {
                            System.out.println("Число меньше загаданного, попробуйте еще");
                            Number = in.nextInt();
                        }


                    }


                }
        System.out.println("Вы угадали число" + "\n количество попыток: " + attemp);
        System.out.println("Конец  игры");







    }

    }








