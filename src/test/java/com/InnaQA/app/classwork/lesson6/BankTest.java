package com.InnaQA.app.classwork.lesson6;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BankTest {
    static Bank privatbank;
    @BeforeClass
    public static void precondition(){
        privatbank = new Bank("Privatbank");
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
    @Test (timeout = 3000)
    public void VerifyForRichMan() throws Exception {
        Person richMan = new Person();
        richMan.setAge(68);
        richMan.setFeedbackFlag(true);
        richMan.setSalary(30000);
        richMan.setWorkFlag(true);
        richMan.setWorkingTime(0);


        Assert.assertTrue(privatbank.isLoanCanBeIssued(richMan)); // вывести, вывести правдивое значение( имя обьекта класса.имя метода(что именно показать,какую переменную)
    }

    @Test
    public void verifyForStudent() throws Exception {
        Person student = new Person();
        student.setAge(21);
        student.setSalary(4200);
        student.setWorkFlag(true);
        student.setWorkingTime(2);

        Assert.assertTrue(privatbank.isLoanCanBeIssued(student));
    }
    @Ignore("Test disable due to reason #1")

    @Test(timeout = 3000)
    public void verifyForPensioner() throws Exception {
        Person pensioner = new Person();
        pensioner.setAge(65);
        pensioner.setSalary(4200);
        pensioner.setWorkingTime(25);

        Assert.assertTrue(privatbank.isLoanCanBeIssued(pensioner));
    }
}