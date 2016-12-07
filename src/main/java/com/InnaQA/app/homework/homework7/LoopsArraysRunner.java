package com.InnaQA.app.homework.homework7;

import java.util.Random;
public class LoopsArraysRunner {

    public static int[] number1() {
        int count = 0;
        int[] intMasiv = new int[10];
        System.out.print("Parne: ");
        for (int i = 2; i <= 20; i = i + 2) {
            count++;
            System.out.print(i + " ");
        }
        return intMasiv;
    }




    public static void number2() {
        int count = 0;
        int[] intMasiv = new int[10];
        System.out.print("Parne:\n");
        for (int i = 2; i <= 20; i = i + 2) {
            intMasiv[count] = i;
            count++;
            System.out.println(i + " ");
        }

    } // создали масив  int[] intMasiv = new int[10]; - перед циклом, и intMasiv[count] = i; - в цикле вызываем.




    public static void number3() {
        int count = 0;
        int[] Masiv2 = new int[100];

        for (int a = 1; a <= 99; a = a + 2) {
            Masiv2[count] = a;
            count++;
           printNumber(a);
        }
        for (int b = 99; b >= 1; b = b - 2) {
            Masiv2[count] = b;
            count++;
            printNumber(b);
        }
    }

    private static void printNumber(int b) {
        System.out.print("Ne_parne: " + b + " ");
    }






    public static void number4(){ // отдельно вывод непарных от 99 до 1
        int count=0;
        int[] Masiv3 = new int [50];
        System.out.print("Ne_parne: ");
        for (int b = 99; b >=1; b = b-2){
            Masiv3[count] = b;
            count++;
            System.out.print(b +" ");
        }
    }






    public static void number5() {
        int count = 0;
        int[] Masiv4 = new int[15];

        for (int i = 1; i < Masiv4.length; i++) {
            Random rnd = new Random();
            Masiv4[i] = rnd.nextInt(99);
            System.out.print(Masiv4[i] + " ");
            System.out.print(i + " ");
            if (Masiv4[i] > 0 & Masiv4[i] % 2 == 0) i++;
        }
    } // как выполнить вторую часть задания и почему выводит по порядку 3,4,5,6,,,,,,





    public static void number6() {
        // потому что выполняется только при 0 и 15/15
        int count = 0;

        int[] Masiv5 = new int[15];
        int min = Masiv5[0];
        int max = Masiv5[0];
        for (int i = 7; i < 14; i++) {
            Random rnd = new Random();
            Masiv5[i] = rnd.nextInt(22);
            if (Masiv5[i] > max) {
                max = Masiv5[i];
            }
            if (Masiv5[i]<min) {
                min=Masiv5[i];
            }
        }
        count++;
        System.out.print("Min.number: " + min + " " + "Max.number: " + max);
    }






    public static void number7(){
        int count = 0;
        int [][]Masiv6 = new int [8][5];
        for(int i=0;i<Masiv6.length;i++){
            for(int a=0;a<Masiv6[i].length;a++){
                Masiv6[i][a]=(int)(Math.random()*90)+10;
                System.out.print(Masiv6[i][a]+" ");
            }
            System.out.println(" ");
        }
    }
}

