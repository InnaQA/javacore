package com.InnaQA.app.classwork.lesson9;

import java.util.Arrays;

public class bubble {

    /* public static void main(String[] args) {
       // ex1();
        //ex2();
       // ex3();// not working
    } */

    public static void ex1() {
        int[] Masiv = {3, 8, 12, 85, 19, 25, 2};
        int count = 0;
        for (int i = 0; i < Masiv.length; i++) {
            for (int j = 1; j < Masiv.length - i; j++) {
                if (Masiv[j - 1] > Masiv[j]) { // знак меняем в этой строчке и соотетственно меняется отбражение
                    int temp = Masiv[j - 1];
                    Masiv[j - 1] = Masiv[j];
                    Masiv[j] = temp;
                }
            }
        }
        for (int mas : Masiv) {
            System.out.println(mas + " ");
        }
    }


    public static void ex2() {
        int[] someArray = {1, 5, 8, 95, 54, 66, 9865, 5463};
        Arrays.sort(someArray);

        System.out.println("Sorted array:\n " + Arrays.toString(someArray)); // бере ерей і переводить в стрінг . StringBuilder
    }

    public static void ex3() {
        char[] charArray = new char[255];

        for (int i = 0; i <= charArray.length; i++) {
            charArray[i] = (char) i;
        }

        System.out.println("Char array: " +

                Arrays.toString(charArray));
    }
}
