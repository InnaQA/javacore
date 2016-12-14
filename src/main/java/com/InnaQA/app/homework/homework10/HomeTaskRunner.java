package com.InnaQA.app.homework.homework10;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomeTaskRunner {
    public static void main(String[] args) throws FileNotFoundException {
        //HomeTask object = new HomeTask();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Homework10 " );
        String main_menu = scanner.nextLine();
        int menu = Integer.parseInt(main_menu);
        switch (menu) {
            case 1 :
                HomeTask.PalindromeOne(main_menu);
                break;
        }
    }
}
