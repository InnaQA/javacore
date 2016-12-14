package com.InnaQA.app.homework.homework10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomeTask {

    public static void run() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.toLowerCase();
        System.out.println(s + " " + s);

        boolean P = true;
    }

    public static boolean PalindromeOne(String s) throws FileNotFoundException {
        if (s.length() / 2 == 0) { // парна кількість символів
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
                return true;
            }
        } else {  // непарна кількість символів
            for (int i = 0; i < s.length() / 2 - 1; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1) - i) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }


}