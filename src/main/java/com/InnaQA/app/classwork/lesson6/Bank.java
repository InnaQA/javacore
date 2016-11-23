package com.InnaQA.app.classwork.lesson6;
import java.util.Scanner;
public class Bank {
    private final static float USD_RATE = 2601.1762F;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void showName() {
        System.out.println("Bank name: " + bankName);
    }

    public static float getUsdRate() {
        return USD_RATE;
    }

    //public void setUSDRate(float USDRate){this.USD_RATE =USDRate;} - будет активно если убрать final)//
    public boolean isLoanCanBeIssued(Person person){
        boolean result = false;
        int score = 0;
        if (person.getAge()>=18 && person.getAge() <=69){
            score = score+1;
        }
        if (person.isWorkFlag()==true){
            score++;
        }
        if (person.getSalary()>4000) {
            score++;
        }
        if (person.isFeedbackFlag()==true)
            score++;               //or (person.isDeedbackFlag())- тоже будет обозначать что тру / в этом методе можно и без скобок, но лучше с ними//
        if (person.getWorkingTime()>=2){
            score++;
        }
        System.out.println("Our score is: " + score);
        if (score < 3) {
            System.out.print("Would you like sell your house? ");
            Scanner sc = new Scanner(System.in);
            if (sc.nextInt()==1) {
                return true;
            }
        }
        else {
            result= true;
        }
        return result;
    }
}
