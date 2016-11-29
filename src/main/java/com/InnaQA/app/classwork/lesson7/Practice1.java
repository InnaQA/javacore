package com.InnaQA.app.classwork.lesson7;

public class Practice1 {
    public static void main(String[] args) {
     //   counter2();
        content3();
       // content4();
        //content5();
    }

    public static void counter(int a, int b) {
        while (a > b) {
            System.out.println(a + " " + b);
            a--;
        }
        System.out.println(a + " " + b);
    }

    public static void counter2() {
        int a = 1;

        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment" + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment" + a);
    }

    public static void content3 (){
        int count = 0;
        for (int i = 0; i <=20; i+=2) {
            count ++;
            System.out.println("парное число: " + i);
        }
        System.out.println("Количество парных чисел: " + count);
    }
    // ниже описание цикла
    public static void content4(){
        int[] intArray = {500, 1000, 2000};
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void content5(){
        int[] intArray = {3,8,15};
        for (int arrElement : intArray){
            System.out.println(arrElement); // выводим каждый элемент с масива, стандартная пропись для любого случая
             /* int[] intArray = {1,2,3};
System.out.println(Arrays.toString(array)); - просто выводит все что внутри масива,
просто чтобы просмотеть , чтобы вывести на экран */
        }
    }
}

// выполнение задания 1-го практического с презентации 7
/*{
        int count = 0;
        for (int i = 0; i <=20; i+=2) {
            count ++;
        } - это тело цикла*/