package com.InnaQA.app.classwork.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 3;
        int b = 2;
        int expRes = 6;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
        Assert.assertEquals(expRes+2,2* MathFunc.divide (20,5));
        Assert.assertEquals(3, MathFunc.divide (35,10));
        System.out.println(2* MathFunc.divide (20,5)+5);
    }

    @Test
    public void divide1(){
        int c = 15;
        int d = 5;
        int ER = 3;
        Assert.assertEquals(ER, MathFunc.divide (c,d));
    }
}
