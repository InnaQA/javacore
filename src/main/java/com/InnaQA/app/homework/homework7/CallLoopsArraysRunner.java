package com.InnaQA.app.homework.homework7;

import com.InnaQA.app.homework.homework7.LoopsArraysRunner;
import java.util.Scanner;

import static com.InnaQA.app.homework.homework7.LoopsArraysRunner.*;

public class CallLoopsArraysRunner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Для вывода масива в cтроку - нажмите 1: ");
        System.out.println("2 - Для вывода масива в cтолбик - нажмите 2: ");
        System.out.println("3 - Для вывода масива непарных чисел до 99 и наоборот - нажмите 3: ");
        System.out.println("4 - Для вывода масива непарных чисел от 99 до 1 - нажмите 4: ");
        System.out.println("5 - Для вывода массива из 15 случайных целых чисел из отрезка [0;9] - нажмите 5: ");
        System.out.println("6 - Для вывода минимального и максимального значения из ряда рандомных чисел - нажмите 6: ");
        System.out.println("7 - Для вывода двумерного массива из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]- нажмите 7: ");

        int menu = scanner.nextInt();

        switch (menu) { // ип даних має бути одинаковий у всіх методах які пишемо всередині свіча
            case 1 : LoopsArraysRunner.number1();
            break;
            case 2 : LoopsArraysRunner.number2();
            break;
            case 3 : LoopsArraysRunner.number3();
            break;
            case 4 : LoopsArraysRunner.number4();
            break;
            case 5 : LoopsArraysRunner.number5();
            break;
            case 6 : LoopsArraysRunner.number6();
            break;
            case 7 : LoopsArraysRunner.number7();
            break;
            default: System.out.println

                    ("You have made incorrect choice");
        }

        /*if (menu == 1) {
            number1();
        }
        if (menu == 2) {
            number2();
        }
        if (menu == 3) {
            number3();
        }
        if (menu == 4) {
            number4();
        }
        if (menu == 5) {
            LoopsArraysRunner.number5();
        }
        if (menu == 6) {
            LoopsArraysRunner.number6();
        }
        if (menu == 7) {
            LoopsArraysRunner.number7();
        } */

    }
}
