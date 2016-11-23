package com.InnaQA.app.homework.homework2;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AppTest {

    @Test
    @FileParameters(value = "src/test/resources/homework2/test1.csv")
    public void parametrizedTest(int x, int y, int result) {
        assert x * y == result;
    }

    
}