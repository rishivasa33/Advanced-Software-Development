package com.dal.ca.rv.asdc.a1.main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LoanProduct {

    public String loanProductId;
    public String loanProductName;
    public double rateOfInterest;
    public double maxPrincipalAmount;
    public int maxLoanRepaymentTerm;

    public String getLoanProductId() {
        return loanProductId;
    }

    public void setLoanProductId(String loanProductId) {
        this.loanProductId = loanProductId;
    }

    public String getLoanProductName() {
        return loanProductName;
    }

    public void setLoanProductName(String loanProductName) {
        this.loanProductName = loanProductName;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getMaxPrincipalAmount() {
        return maxPrincipalAmount;
    }

    public void setMaxPrincipalAmount(double maxPrincipalAmount) {
        this.maxPrincipalAmount = maxPrincipalAmount;
    }

    public int getMaxLoanRepaymentTerm() {
        return maxLoanRepaymentTerm;
    }

    public void setMaxLoanRepaymentTerm(int maxLoanRepaymentTerm) {
        this.maxLoanRepaymentTerm = maxLoanRepaymentTerm;
    }

    public List<LoanProduct> getLoanProducts(ILoanProduct iLoanProduct) {
        //In real implementation, this would have been a call to the actual DB operations method
        return iLoanProduct.fetchLoanProductsFromMockDB();
    }

    public String createLoanProduct(LoanProduct newLoanProduct, boolean testMode, ILoanProduct iLoanProduct) {
        String result;
        if (testMode) {
            result = iLoanProduct.addLoanProductToMockDB(newLoanProduct);
        } else {
            newLoanProduct = new LoanProduct();
            try {
                Scanner sc = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Enter the New Loan Product ID");
                newLoanProduct.setLoanProductId(sc.next());
                System.out.println("Enter the New Loan Product Name");
                newLoanProduct.setLoanProductName(sc.next());
                System.out.println("Enter the Maximum Principal Amount allowed for the new Loan Product");
                newLoanProduct.setMaxPrincipalAmount(sc.nextDouble());
                System.out.println("Enter the initial Rate of Interest for the new Loan Product");
                newLoanProduct.setRateOfInterest(sc.nextDouble());
                System.out.println("Enter the Maximum number of Years allowed for repayment for the new Loan Product");
                newLoanProduct.setMaxLoanRepaymentTerm(sc.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("\nIncorrect input. Try entering loan details Again\n");
                return "FAILED";
            }
            //In actual implementation, this would have been a call to the actual DB operations method
            result = iLoanProduct.addLoanProductToMockDB(newLoanProduct);

            if (result.equalsIgnoreCase("SUCCESS")) {
                System.out.println("\nNew Loan Product Successfully Created!\n" + newLoanProduct);
                return result;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "\nloanProductId='" + loanProductId + '\'' + "\n" +
                "loanProductName='" + loanProductName + '\'' + "\n" +
                "rateOfInterest=" + rateOfInterest + "\n" +
                "maxPrincipalAmount=" + maxPrincipalAmount + "\n" +
                "maxLoanRepaymentTerm=" + maxLoanRepaymentTerm + "\n";
    }
}
