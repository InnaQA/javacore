package com.InnaQA.app.homework.homework9;

import java.util.Arrays;
import java.util.Random;

public class bubble_homework {

    public static int[] homework1() {
        int[] Masiv = {7, 1, 2, 85, 0, 5, 23};
        int count = 0;
        System.out.println("Вывод чисел от меньшего до большего: ");
        for (int i = 0; i < Masiv.length; i++) {
            for (int j = 1; j < Masiv.length - i; j++) {
                if (Masiv[j - 1] > Masiv[j]) {
                    int temp = Masiv[j - 1];
                    Masiv[j - 1] = Masiv[j];
                    Masiv[j] = temp;
                }
            }
        }
        for (int x =0; x < Masiv.length; x++ ){
            System.out.println(Masiv[x]);
        }
        return Masiv;
    }

    public static int[] homework2() {
        int[] Masiv2 = {35, 45, 12, 75, 59, 25, 2};
        int count = 0;
        System.out.println("Вывод чисел от большего до меньшего: ");
        for (int i = 0; i < Masiv2.length; i++) {
            for (int j = 1; j < Masiv2.length - i; j++) {
                if (Masiv2[j - 1] < Masiv2[j]) {
                    int temp = Masiv2[j - 1];
                    Masiv2[j - 1] = Masiv2[j];
                    Masiv2[j] = temp;
                }
            }
        }
        for (int a =0; a < Masiv2.length; a++ ){
            System.out.println(Masiv2[a]);
        }
        return Masiv2;
    }


        public static int[][] homework3(){
            int [][] Mas = new int[8][12];
            for(int i =0;i<Mas.length;i++){
                for(int a=0; a<Mas[i].length; a++){
                    Mas[i][a]=(int)((Math.random()*199)-99);
                    System.out.print(Mas[i][a]+", ");
                }
            }
            int min=Mas[0][0];
            for(int i =0;i<Mas.length;i++){
                for(int x=0;x<Mas[i].length;x++){
                    if(Mas[i][x]>min)min=Mas[i][x];
                }
            }
            System.out.println(" ");
            System.out.println("Значение максимального элемента массива = "  + min);
            return Mas;
        }
        public static void homework4(){
            /*int [][] Mas = new int[21][7];
            for(int i =0;i<Mas.length;i++){
                for(int h=0;h<Mas[i].length;h++){
                    Mas[i][h]=(int)(Math.random()*2)+8;
                    if(h==Mas[i].length-1){
                        Mas[i][h]=Mas[i][h-2]*Mas[i][h-1];
                        for(int q=0;q<i;q++){
                            if(Mas[i][h]==Mas[q][h]&&i>0){
                                if(Mas[i][h-1]==Mas[q][h-1]||Mas[i][h-2]==Mas[q][h-2]) --i;
                            }
                        }
                    }
                }
            }
            for(int i=0;i<Mas.length;i++) {
                System.out.print("exersice b" + (i + 1 + " Умножение "));
                for (int h = 0; h < Mas[i].length; h++) {
                    if (h == 0)
                        System.out.print(Mas[i][h] + " на ");
                    if (h == 1)
                        System.out.println(Mas[i][h]);
                }
            }
            return Mas;*/
            int [][] Mas = new int[15][2];
            int randA = 0, randB = 0;
            Random rnd = new Random();
            for (int i = 0; i < Mas.length; i++) {
                boolean isRepeat = true;
                while (isRepeat) {
                    randA = rnd.nextInt(8) + 2;
                    randB = rnd.nextInt(8) + 2;
                    for (int j = 0; j <= i; j++) {
                        if ((Mas[j][0] == randA && Mas[j][1] == randB) || (Mas[j][1] == randA && Mas[j][0] == randB)) {
                            break;
                        }
                        isRepeat = false;
                    }
                }
                Mas[i][0] = randA;
                Mas[i][1] = randB;
            }

            for (int i = 0; i < Mas.length; i++) {
                System.out.println(Mas[i][0]+" * " + Mas[i][1]+" = "+ Mas[i][0]* Mas[i][1]);
            }
        }

    public static void homework5(){
        int randomNum = 0;
        int [] Mas = new int [20];
        Random rand = new Random();

        for (int i = 0; i < Mas.length; i++){
            randomNum = rand.nextInt(1000);
            Mas[i] = randomNum;
        }

        String unsortMassive = Arrays.toString(Mas);
        System.out.println("Unsorted array: " + unsortMassive);

        for (int i = 0; i < Mas.length; i++){
            int index = i;
            for (int j = i+1; j < Mas.length; j++){
                if (Mas[j] < Mas[index]){
                    index = j;
                }
            }
            int smallerNumber = Mas[index];
            Mas[index] = Mas[i];
            Mas[i] = smallerNumber;
        }

        String sortMassive = Arrays.toString(Mas);
        System.out.println("Sorted array: " + sortMassive);

    }
    }