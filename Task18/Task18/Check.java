package com.Task18;

import java.util.Scanner;

public class Check {
    void chekValue() throws Number12Exception {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите два любых целых числа");
        int number1 = number.nextInt();
        int number2 = number.nextInt();
        if (number1 > number2) {
            System.out.println("Первое число больше второго");
        } else if (number1 < number2) {
            System.out.println("Первое число меньше второго");
        } else if(number1 == number2) {
            throw new Number12Exception("Ввод двух одинаковых чисел запрещен");

        }

    }
}