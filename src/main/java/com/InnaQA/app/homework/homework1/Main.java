package com.InnaQA.app.homework.homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - For calculating square for circle enter 1: ");
        System.out.println("2 - For checking if triangle is straight enter 2: ");
        System.out.println("3 - For definition event of number enter 3: ");
        System.out.println("4 - For obtain a bigger number enter 4: ");
        Methods m = new Methods();
        int menu = scanner.nextInt();
        if (menu == 1) {
            System.out.println("Please,enter radius of circle: ");
            int p = scanner.nextInt();
            double result = m.getSquareCircle(p);
            System.out.println(result);
        }
        if (menu ==2){
            System.out.println("Please,enter first number for triangle: ");
            int a = scanner.nextInt();
            System.out.println("Please,enter second number for triangle: ");
            int b = scanner.nextInt();
            System.out.println("Please,enter third number for triangle: ");
            int c = scanner.nextInt();
            boolean result = m.getSideTriangle(a,b,c);
            System.out.println(result);
        }
        if (menu == 3){
            System.out.println("Please enter a number: ");
            int a = scanner.nextInt();
            boolean result = m.getEvenNumber(a);
            System.out.println(result);
        }
        System.out.println("Please enter a first number: ");
        int a = scanner.nextInt();
        System.out.println("Please, enter a second number: ");
        int b = scanner.nextInt();
        boolean result = m.getFirstHigher(a,b);
        System.out.println(result);

    }
}

