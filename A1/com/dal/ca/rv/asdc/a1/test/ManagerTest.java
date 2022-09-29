package com.dal.ca.rv.asdc.a1.test;

import com.dal.ca.rv.asdc.a1.main.MockDB;
import com.dal.ca.rv.asdc.a1.main.IAuthentication;
import com.dal.ca.rv.asdc.a1.main.Manager;

public class ManagerTest {

    public int getManagerIdTest() {
        Manager manager = new Manager();
        String managerID = manager.getManagerId();
        if (managerID == null) {
            manager.setManagerId("ManagerIdTestGet");
            managerID = manager.getManagerId();
            if (managerID.equals("ManagerIdTestGet")) {
                System.out.println("getManagerIdTest Passed!");
                return 1;
            } else {
                System.out.println("getManagerIdTest Failed!");
                System.out.println("Expected: <ManagerIdTestGet> but was: <" + managerID + ">");
                return 0;
            }
        } else {
            System.out.println("getManagerIdTest Failed!");
            System.out.println("Expected: <null> but was: <" + managerID + ">");
            return 0;
        }
    }

    public int setManagerIdTest() {
        Manager manager = new Manager();
        String managerID = manager.getManagerId();
        if (managerID == null) {
            manager.setManagerId("ManagerIdTestSet");
            managerID = manager.getManagerId();
            if (managerID.equals("ManagerIdTestSet")) {
                System.out.println("setManagerIdTest Passed!");
                return 1;
            } else {
                System.out.println("setManagerIdTest Failed!");
                System.out.println("Expected: <ManagerIdTestSet> but was: <" + managerID + ">");
                return 0;
            }
        } else {
            System.out.println("setManagerIdTest Failed!");
            System.out.println("Expected: <null> but was: <" + managerID + ">");
            return 0;
        }
    }

    public int getBranchIdTest() {
        Manager manager = new Manager();
        String branchID = manager.getBranchId();
        if (branchID == null) {
            manager.setBranchId("BranchIdTestGet");
            branchID = manager.getBranchId();
            if (branchID.equals("BranchIdTestGet")) {
                System.out.println("getBranchIdTest Passed!");
                return 1;
            } else {
                System.out.println("getBranchIdTest Failed!");
                System.out.println("Expected: <BranchIdTestGet> but was: <" + branchID + ">");
                return 0;
            }
        } else {
            System.out.println("getBranchIdTest Failed!");
            System.out.println("Expected: <null> but was: <" + branchID + ">");
            return 0;
        }
    }

    public int setBranchIdTest() {
        Manager manager = new Manager();
        String branchID = manager.getBranchId();
        if (branchID == null) {
            manager.setBranchId("BranchIdTestSet");
            branchID = manager.getBranchId();
            if (branchID.equals("BranchIdTestSet")) {
                System.out.println("setBranchIdTest Passed!");
                return 1;
            } else {
                System.out.println("setBranchIdTest Failed!");
                System.out.println("Expected: <BranchIdTestSet> but was: <" + branchID + ">");
                return 0;
            }
        } else {
            System.out.println("setBranchIdTest Failed!");
            System.out.println("Expected: <null> but was: <" + branchID + ">");
            return 0;
        }
    }

    public int getPasswordTest() {
        Manager manager = new Manager();
        String password = manager.getPassword();
        if (password == null) {
            manager.setPassword("PasswordTestGet");
            password = manager.getPassword();
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
        Manager manager = new Manager();
        String password = manager.getPassword();
        if (password == null) {
            manager.setPassword("PasswordTestSet");
            password = manager.getPassword();
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

    public int managerLoginTestSuccess() {
        Manager manager = new Manager();
        manager.setManagerId("managerid");
        manager.setBranchId("halifax123");
        manager.setPassword("password");

        String testResult;
        IAuthentication dbMock = new MockDB();
        testResult = manager.managerLogin(true, dbMock);
        if (testResult.equalsIgnoreCase("Success")) {
            System.out.println("managerLoginTestSuccess Passed!");
            return 1;
        } else {
            System.out.println("managerLoginTestSuccess Failed!");
            System.out.println("Expected: <SUCCESS> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int managerLoginTestIncorrectID() {
        Manager manager = new Manager();
        manager.setManagerId("incorrectID");
        manager.setBranchId("halifax123");
        manager.setPassword("password");

        String testResult;
        IAuthentication dbMock = new MockDB();
        testResult = manager.managerLogin(true, dbMock);
        if (testResult.equalsIgnoreCase("Incorrect ID")) {
            System.out.println("managerLoginTestIncorrectID Passed!");
            return 1;
        } else {
            System.out.println("managerLoginTestIncorrectID Failed!");
            System.out.println("Expected: <Incorrect ID> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int managerLoginTestIncorrectBranch() {
        Manager manager = new Manager();
        manager.setManagerId("managerid");
        manager.setBranchId("incorrectbranch");
        manager.setPassword("password");

        String testResult;
        IAuthentication dbMock = new MockDB();
        testResult = manager.managerLogin(true, dbMock);
        if (testResult.equalsIgnoreCase("Incorrect Branch ID")) {
            System.out.println("managerLoginTestIncorrectBranch Passed!");
            return 1;
        } else {
            System.out.println("managerLoginTestIncorrectBranch Failed!");
            System.out.println("Expected: <Incorrect ID> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int managerLoginTestIncorrectPassword() {
        Manager manager = new Manager();
        manager.setManagerId("managerid");
        manager.setBranchId("halifax123");
        manager.setPassword("incorrectpassword");

        String testResult;
        IAuthentication dbMock = new MockDB();
        testResult = manager.managerLogin(true, dbMock);
        if (testResult.equalsIgnoreCase("Incorrect Password")) {
            System.out.println("managerLoginTestIncorrectBranch Passed!");
            return 1;
        } else {
            System.out.println("managerLoginTestIncorrectBranch Failed!");
            System.out.println("Expected: <Incorrect Password> but was: <" + testResult + ">");
            return 0;
        }
    }
}
