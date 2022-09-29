package com.dal.ca.rv.asdc.a1.main;

import java.util.Scanner;

public class Manager {

    private String managerId;
    private String branchId;
    private String password;

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String managerLogin(boolean testMode, IAuthentication auth) {
        try {
            if (!testMode) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Manager ID (Valid Mock: managerid)");
                setManagerId(sc.next());
                System.out.println("Enter Branch ID (Valid Mock: halifax123)");
                setBranchId(sc.next());
                System.out.println("Enter password (Valid Mock: password)");
                setPassword(sc.next());
            }
            //In actual implementation, this would have been a call to the actual DB operations method
            return auth.login(getManagerId(), getBranchId(), getPassword());
        } catch (Exception e) {
            return "Failed";
        }
    }
}
