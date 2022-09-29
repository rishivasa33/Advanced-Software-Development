package com.dal.ca.rv.asdc.a1.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoanApplication {

    public String customerID;
    public int creditScore;
    public boolean isEmployed;
    public double annualIncome;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String checkLoanEligibility(LoanApplication loanApplication, boolean testMode, ICreditScore mockAPI) {

        if (!testMode) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Are you employed? Enter 'true' or 'false'");
                loanApplication.setEmployed(sc.nextBoolean());
                System.out.println("What is your annual income?");
                loanApplication.setAnnualIncome(sc.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("\nIncorrect input. Try entering the details Again\n");
                return "FAILED";
            }
        }

        loanApplication.setCreditScore(checkCreditScore(loanApplication.getCustomerID(), mockAPI));

        //System.out.println("Checking whether Customer: " + loan.getCustomerID() + " with a creditScore: " + loan.getCreditScore() + " who isEmployed: " + loan.isEmployed() + " and has an annualIncome of: " + loan.getAnnualIncome() + " is Eligible to apply for a Loan");
        String eligibilityResult = validateCustomerForLoanApplication(loanApplication);
        if (!testMode) {
            System.out.println("\nCustomer: " + loanApplication.getCustomerID() + " with a creditScore of: " + loanApplication.getCreditScore() + " who isEmployed: " + loanApplication.isEmployed() + " and has an annualIncome of: " + loanApplication.getAnnualIncome() + " eligibility for a loan is: " + eligibilityResult + "\n");
        }
        return eligibilityResult;
    }


    public int checkCreditScore(String customerID, ICreditScore mockAPI) {
        return mockAPI.fetchCreditScoreFromAPI(customerID);
    }

    //Created this private method for modularity. Not testing this method specifically as it will be tested indirectly via its caller methods
    private String validateCustomerForLoanApplication(LoanApplication loanApplication) {
        if (loanApplication.getCreditScore() == 0) {
            return "YOU HAVE NO CREDIT SCORE REPORT";
        }
        if (loanApplication.getCreditScore() >= 700) {
            if (loanApplication.isEmployed()) {
                if (loanApplication.getAnnualIncome() >= 85000) {
                    return "SUCCESS";
                } else {
                    return "ANNUAL INCOME FOR EMPLOYED PERSON IS LOWER THAN 85000";
                }
            } else {
                if (loanApplication.getAnnualIncome() >= 100000) {
                    return "SUCCESS";
                } else {
                    return "ANNUAL INCOME FOR NON-EMPLOYED OR BUSINESS PERSON IS LOWER THAN 100000";
                }
            }
        } else {
            return "CREDIT SCORE IS LOWER THAN 700";
        }
    }

    public double calculateInterest(boolean testMode, double principalAmount, int loanTerm, double rateOfInterest) {
        double totalInterest;
        if (!testMode) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Principal Amount: ");
                principalAmount = sc.nextDouble();
                System.out.println("Enter the Loan Term in Years: ");
                loanTerm = sc.nextInt();
                System.out.println("Enter the Rate of Interest: ");
                rateOfInterest = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("\nIncorrect input. Try entering the details Again\n");
            }
        }
        if (principalAmount <= 0 || loanTerm <= 0 || rateOfInterest <= 0) {
            return 0;
        }
        totalInterest = (principalAmount * loanTerm * rateOfInterest) / 100;

        if (!testMode) {
            System.out.println("Your total interest is: " + totalInterest);
            System.out.println("Your yearly interest is: " + (totalInterest / loanTerm));
            System.out.println("Your total payable amount including interest is: " + (principalAmount + totalInterest));
        }
        return totalInterest;
    }
}
