package com.dal.ca.rv.asdc.a1.test;

import com.dal.ca.rv.asdc.a1.main.Customer;
import com.dal.ca.rv.asdc.a1.main.MockDB;
import com.dal.ca.rv.asdc.a1.main.IAuthentication;

public class CustomerTest {

    public int getCustomerIdTest() {
        Customer customer = new Customer();
        String customerID = customer.getCustomerId();
        if (customerID == null) {
            customer.setCustomerId("CustomerIdTestGet");
            customerID = customer.getCustomerId();
            if (customerID.equals("CustomerIdTestGet")) {
                System.out.println("getCustomerIdTest Passed!");
                return 1;
            } else {
                System.out.println("getCustomerIdTest Failed!");
                System.out.println("Expected: <CustomerIdTestGet> but was: <" + customerID + ">");
                return 0;
            }
        } else {
            System.out.println("getCustomerIdTest Failed!");
            System.out.println("Expected: <null> but was: <" + customerID + ">");
            return 0;
        }
    }

    public int setCustomerIdTest() {
        Customer customer = new Customer();
        String customerID = customer.getCustomerId();
        if (customerID == null) {
            customer.setCustomerId("CustomerIdTestSet");
            customerID = customer.getCustomerId();
            if (customerID.equals("CustomerIdTestSet")) {
                System.out.println("setCustomerIdTest Passed!");
                return 1;
            } else {
                System.out.println("setCustomerIdTest Failed!");
                System.out.println("Expected: <CustomerIdTestSet> but was: <" + customerID + ">");
                return 0;
            }
        } else {
            System.out.println("setCustomerIdTest Failed!");
            System.out.println("Expected: <null> but was: <" + customerID + ">");
            return 0;
        }
    }

    public int getPasswordTest() {
        Customer customer = new Customer();
        String password = customer.getPassword();
        if (password == null) {
            customer.setPassword("PasswordTestGet");
            password = customer.getPassword();
            if (password.equals("PasswordTestGet")) {
                System.out.println("getPasswordTest Passed!");
                return 1;
            } else {
                System.out.println("getPasswordTest Failed!");
                System.out.println("Expected: <PasswordTestGet> but was: <" + password + ">");
                return 0;
            }
        } else {
            System.out.println("getPasswordTest Failed!");
            System.out.println("Expected: <null> but was: <" + password + ">");
            return 0;
        }
    }

    public int setPasswordTest() {
        Customer customer = new Customer();
        String password = customer.getPassword();
        if (password == null) {
            customer.setPassword("PasswordTestSet");
            password = customer.getPassword();
            if (password.equals("PasswordTestSet")) {
                System.out.println("setPasswordTest Passed!");
                return 1;
            } else {
                System.out.println("setPasswordTest Failed!");
                System.out.println("Expected: <PasswordTestSet> but was: <" + password + ">");
                return 0;
            }
        } else {
            System.out.println("setPasswordTest Failed!");
            System.out.println("Expected: <null> but was: <" + password + ">");
            return 0;
        }
    }

    public int getAccountTypeTest() {
        Customer customer = new Customer();
        String accountType = customer.getAccountType();
        if (accountType == null) {
            customer.setAccountType("AccountTypeTestGet");
            accountType = customer.getAccountType();
            if (accountType.equals("AccountTypeTestGet")) {
                System.out.println("getAccountTypeTest Passed!");
                return 1;
            } else {
                System.out.println("getAccountTypeTest Failed!");
                System.out.println("Expected: <AccountTypeTestGet> but was: <" + accountType + ">");
                return 0;
            }
        } else {
            System.out.println("getAccountTypeTest Failed!");
            System.out.println("Expected: <null> but was: <" + accountType + ">");
            return 0;
        }
    }

    public int setAccountTypeTest() {
        Customer customer = new Customer();
        String accountType = customer.getAccountType();
        if (accountType == null) {
            customer.setAccountType("AccountTypeTestSet");
            accountType = customer.getAccountType();
            if (accountType.equals("AccountTypeTestSet")) {
                System.out.println("setAccountTypeTest Passed!");
                return 1;
            } else {
                System.out.println("setAccountTypeTest Failed!");
                System.out.println("Expected: <AccountTypeTestSet> but was: <" + accountType + ">");
                return 0;
            }
        } else {
            System.out.println("setAccountTypeTest Failed!");
            System.out.println("Expected: <null> but was: <" + accountType + ">");
            return 0;
        }
    }

    public int getAccountNoTest() {
        Customer customer = new Customer();
        String accountNo = customer.getAccountNo();
        if (accountNo == null) {
            customer.setAccountNo("AccountNoTestGet");
            accountNo = customer.getAccountNo();
            if (accountNo.equals("AccountNoTestGet")) {
                System.out.println("getAccountNoTest Passed!");
                return 1;
            } else {
                System.out.println("getAccountNoTest Failed!");
                System.out.println("Expected: <AccountNoTestGet> but was: <" + accountNo + ">");
                return 0;
            }
        } else {
            System.out.println("getAccountNoTest Failed!");
            System.out.println("Expected: <null> but was: <" + accountNo + ">");
            return 0;
        }
    }

    public int setAccountNoTest() {
        Customer customer = new Customer();
        String accountNo = customer.getAccountNo();
        if (accountNo == null) {
            customer.setAccountNo("AccountNoTestSet");
            accountNo = customer.getAccountNo();
            if (accountNo.equals("AccountNoTestSet")) {
                System.out.println("setAccountNoTest Passed!");
                return 1;
            } else {
                System.out.println("setAccountNoTest Failed!");
                System.out.println("Expected: <AccountNoTestSet> but was: <" + accountNo + ">");
                return 0;
            }
        } else {
            System.out.println("setAccountNoTest Failed!");
            System.out.println("Expected: <null> but was: <" + accountNo + ">");
            return 0;
        }
    }

    public int customerLoginTestSuccess() {
        Customer customer = new Customer();
        customer.setCustomerId("customerid");
        customer.setPassword("password");

        String testResult;
        IAuthentication dbMock = new MockDB();
        testResult = customer.customerLogin(true, dbMock);
        if (testResult.equalsIgnoreCase("Success")) {
            System.out.println("customerLoginTestSuccess Passed!");
            return 1;
        } else {
            System.out.println("customerLoginTestSuccess Failed!");
            return 0;
        }
    }

    public int customerLoginTestIncorrectID() {
        Customer customer = new Customer();
        customer.setCustomerId("incorrectID");
        customer.setPassword("password");

        String testResult;
        IAuthentication dbMock = new MockDB();
        testResult = customer.customerLogin(true, dbMock);
        if (testResult.equalsIgnoreCase("Incorrect ID")) {
            System.out.println("customerLoginTestIncorrectID Passed!");
            return 1;
        } else {
            System.out.println("customerLoginTestIncorrectID Failed!");
            System.out.println("Expected: <Incorrect ID> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int customerLoginTestIncorrectPassword() {
        Customer customer = new Customer();
        customer.setCustomerId("customerid");
        customer.setPassword("incorrectpassword");

        String testResult;
        IAuthentication dbMock = new MockDB();
        testResult = customer.customerLogin(true, dbMock);
        if (testResult.equalsIgnoreCase("Incorrect Password")) {
            System.out.println("customerLoginTestIncorrectPassword Passed!");
            return 1;
        } else {
            System.out.println("customerLoginTestIncorrectPassword Failed!");
            System.out.println("Expected: <Incorrect Password> but was: <" + testResult + ">");
            return 0;
        }
    }
}
