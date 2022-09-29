package com.dal.ca.rv.asdc.a1.main;

import java.util.Scanner;

public class Customer {

    private String customerId;
    private String password;
    private String accountType;
    private String accountNo;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String customerLogin(boolean testMode, IAuthentication auth) {
        try {
            if (testMode) {
                return auth.login(getCustomerId(), getPassword());
            } else {
                String customerLoginResult;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Customer ID (Valid Mock: customerid)");
                setCustomerId(sc.next());
                System.out.println("Enter password (Valid Mock: password)");
                setPassword(sc.next());

                //In actual implementation, this would have been a call to the actual DB operations method
                customerLoginResult = auth.login(getCustomerId(), getPassword());

                if (customerLoginResult.equalsIgnoreCase("Success")) {
                    setAccountNo("SAV12312313590");
                    setAccountType("SAVINGS");
                    System.out.println("Welcome, " + getCustomerId() + "\nYour " + getAccountType() + " Account Number is: " + getAccountNo());
                }
                return customerLoginResult;
            }
        } catch (Exception e) {
            return "Failed";
        }
    }
}
