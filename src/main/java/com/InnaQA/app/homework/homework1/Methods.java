package com.InnaQA.app.homework.homework1;

public class Methods {


    /*  public static double getCircleArea (double r){
          double circle = 2*Math.PI * r;
            return circle; - длина круга
        } */

    public double getSquareCircle (double r1){
        double square = (Math.PI * r1) * (r1);
        return square;
        // вычечление площи круга
    }

    public boolean getSideTriangle ( int a, int b, int c){
        boolean result = false;
        int gipotenuza = Math.max(Math.max(a,b), c);
        int catet1 = Math.min(Math.min(a,b), c);
        int catet2 = 0;
        int squaregipotenuza = 0;
        int squarecatet1 = 0;
        int squarecatet2 = 0;

        if (gipotenuza == a){
            if(catet1 == b) {
                catet2 = c;
            } else {
                catet2 = b;
            }
        }
        if (gipotenuza == b){
            if(catet1 == a) {
                catet2 = c;
            } else {
                catet2 = a;
            }
        }
        if (gipotenuza == c){
            if(catet1 == a ) {
                catet2 = b;
            } else {
                catet2 = a ;
            }
        }
        squaregipotenuza = gipotenuza * gipotenuza;
        squarecatet1 = catet1 * catet1;
        squarecatet2 = catet2 * catet2;

        if (squaregipotenuza == squarecatet1 + squarecatet2){
            result = true;
        }
        else {
            result = false;
        }
        return result;
        //определение могут ли две три цифры быть сторонами прямоугольного треугольника
    }
    public boolean getEvenNumber (int a){
        return (a % 2 ==0);
        // определение, является ли число четным или нечетным
    }
    public boolean getFirstHigher (int a, int b){
        return a>=b;
        // какое число больеше первое или второе
    }
}
