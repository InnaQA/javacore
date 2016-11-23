package com.InnaQA.app.classwork.lesson1.convertors;

import com.InnaQA.app.classwork.lesson1.runners.Lesson3Runner;

public class PrimitiveConvertor {
    public static void main (String args[]) {
        Lesson3Runner l = new Lesson3Runner ();
        l.floatToChar(7.0f);
        l.intToChar (123);
        l.charToInt((char) 12);
    }
}