package com.InnaQA.app.classwork.lesson1.runners;

public class Lesson3Runner {
    public static char floatToChar (float f) {
        char c = (char) f;
        System.out.println("Input float value is " + (float) f + ". Output char value is " + (char) c);
        return c;
    }

    public static char intToChar (int i) {
        char c = (char) i;
        System.out.println ("Input int value is "  + (int) i + ". Output char value is " + (char) c);
        return c;
    }
    public static int charToInt (char c) {
        int i = (char) c;
        System.out.println ("Input char value is " + (char) c + ". Output char value is " + (int) i);
        return i;
    }

}
