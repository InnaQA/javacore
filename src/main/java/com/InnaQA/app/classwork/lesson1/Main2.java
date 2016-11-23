package com.InnaQA.app.classwork.lesson1;

public class Main2 {
    public static void main1(String[] args) {
        int i = 1234598522;
        float f = 15.2f;
        long l = 123456789567890L;

        i = (int) l;
        System.out.println(i);}

    public static void main(String[] args) {
        int i = 35000;

        short oldThermometer;
        long newThermometer;

        oldThermometer = (short) i;
        newThermometer = (long) i;

        System.out.println("oldThermometer: " + newThermometer);
        System.out.println("newThermometer: " + oldThermometer);
    }
}
