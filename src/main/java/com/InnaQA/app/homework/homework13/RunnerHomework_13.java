package com.InnaQA.app.homework.homework13;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RunnerHomework13 {
    public static void main(String[] args) {
        System.out.println("Homework13 ");
        //если ввести возраст, что не входит в диапазон 1 - 120 - высветится Age invalid.
        WhiteCollar Runner = new WhiteCollar("Inna", 20, "Sannacode"); // если ввести Саннакод вместо Sannacode - высветится Company name is invalid
        Scanner scanner = new Scanner(System.in);
        String runner = scanner.nextLine();
        int menu = parseInt(runner);
        switch (menu) {
            case 1:
                Runner.getName();
                break;
            case 2:
                Runner.getAge();
                break;
            case 3:
                Runner.getCompany();
                break;
        }
    }
}
