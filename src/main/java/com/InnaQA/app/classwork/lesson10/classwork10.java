package com.InnaQA.app.classwork.lesson10;

import java.util.Arrays;

public class classwork10 {
    public static void main(String[] args) {
       /* String StringToDisplay = "";
        char[] charArreyToString = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < charArreyToString.length; i++){
            StringToDisplay += charArreyToString[i];
        }

        StringToDisplay= Arrays.toString(charArreyToString)
                .replace( "a" , " x ");
        System.out.println(StringToDisplay); */


       /* double dot = 1000.002;
        String display = String.valueOf(dot);
        System.out.println(display);
    } */

  /*  public static void displayText(Integer number) {
        System.out.println(number);
    }

    public static void displayText(Double dd) {
        System.out.println(dd);
    }*/

    /*String s = "1,2,3,5,3,58";
   String [] fileredData = s.split(","); // розділяє значення і створює з окремого елемента масив окремий

    String summary = fileredData[2];
    int summInt = Integer.parseInt(summary);*/

       /* int summary1 = 3333;
        String sum = String.valueOf(summary1);
        System.out.println(sum);*/

       Double summary2 = 100.003;
        String sum2 = String.valueOf(summary2);
        Double sum3 = Double.valueOf(sum2);
        System.out.println(sum3);

        long summary3 = 652126754864L;
        String sum4 = String.valueOf(summary3);
        Long sum5 = Long.valueOf(sum4);
        System.out.println(sum5);

    }
}
