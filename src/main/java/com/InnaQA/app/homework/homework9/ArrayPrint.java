package com.InnaQA.app.homework.homework9;

import java.util.Scanner;

public class ArrayPrint {
    public static void main (String [] args) {
        bubble_homework object = new bubble_homework();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Для вывода чисел от меньшего до большего - нажмите 1: ");
        System.out.println("2 - Для вывода чисел от большего до меньшего - нажмите 2: ");
        System.out.println("3 - Для вывода двумерного массива из 5 строк по 8 столбцов - нажмите 3: ");
        System.out.println("4 - Для проверки остаточных значений учеников - нажмите 4: ");
        System.out.println("5 - Для Selection сортировки - нажмите 5: ");
        int menu2 = scanner.nextInt();

        switch (menu2){
            case 1: bubble_homework.homework1();
                break;
            case 2: bubble_homework.homework2();
                break;
            case 3: bubble_homework.homework3();
                break;
            case 4: bubble_homework.homework4();
                break;
            case 5: bubble_homework.homework5();
                break;

            default: System.out.println
                 ("ERROR!");
        }
    }
}
