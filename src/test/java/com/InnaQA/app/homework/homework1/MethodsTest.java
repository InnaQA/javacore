package com.InnaQA.app.homework.homework1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class MethodsTest {
    @BeforeClass
    public static void precondition(){
        Methods square = new Methods ();
        System.out.println("Test cases was started. ");
    }
    @Before
    public void messageStart(){
        System.out.println("Test started.");
    }
    @After
    public void messageFinish(){
        System.out.println("Test finished!");
    }

    @org.junit.Test (timeout = 3000)
    public void getSquareCircle() throws Exception {
        Methods first = new Methods ();
        Assert.assertEquals(12.566370614359172,first.getSquareCircle(2)); // почему он не пройден? что не так?
    }

    @org.junit.Test (timeout = 3000)
    public void getSideTriangle() throws Exception {
        Methods second = new Methods ();
        Assert.assertEquals(true,second.getSideTriangle(3,4,5));
    }

    @org.junit.Test (timeout = 3000)
    public void getEvenNumber() throws Exception {
        Methods third = new Methods();
        Assert.assertEquals(true,third.getEvenNumber(7)); // почему он не пройден? что не так?
    }

    @org.junit.Test (timeout = 3000)
    public void getFirstHigher() throws Exception {
        Methods fourth = new Methods ();
        Assert.assertEquals(false,fourth.getFirstHigher(12,35));
    }

    @org.junit.Test (timeout = 3000)
    public void getFirstHigher1() throws Exception {
        Methods fourth = new Methods ();
        Assert.assertEquals(true,fourth.getFirstHigher(35,12));
    }

}