package com.InnaQA.app.homework.homework2;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AppTest {

    @Test
    @FileParameters(value = "src/test/resources/homework2/test1.csv")
    public void Test1(int x, int y, int result) {
        assert x * y == result;
    }

    @Test
    @FileParameters(value = "src/test/resources/homework2/test2.csv")
    public void Test2(int x, int y, int result) {
        assert x / y == result;
        System.out.println("Tests finished ! You result is:  " + result);
    }

    @Test
    @FileParameters(value = "src/test/resources/homework2/test3.csv")
    public void Test3(int x, int y,int q, int result) {
        assert (x / y) + q == result;
        System.out.println("Tests finished ! You result is:  " + result);
    }

}
