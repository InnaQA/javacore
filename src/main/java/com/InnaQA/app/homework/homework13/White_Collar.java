package com.InnaQA.app.homework.homework13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhiteCollar extends com.InnaQA.app.homework.homework_13.Human {
    private String company;


    public WhiteCollar(String name, int age, String company) {
        super(name, age);
        if (checkCompanyName(company)) {
            this.company = company;
        }
    }

    public boolean checkCompanyName(String company) {
        Pattern pattern = Pattern.compile("([a-zA-Z| |,-])*");
        Matcher matcher = pattern.matcher(company);
        String result = (matcher.matches()) ? "Name of company: " + company : "Company name is invalid";
        System.out.println(result);

        return false;

    }
    public String getCompany() {
        return company;
    }


    public void setCompany(String company) {
        if (checkCompanyName(company)) {
            this.company = company;
        }

    }

}
