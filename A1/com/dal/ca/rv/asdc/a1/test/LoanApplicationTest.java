package com.dal.ca.rv.asdc.a1.test;

import com.dal.ca.rv.asdc.a1.main.ICreditScore;
import com.dal.ca.rv.asdc.a1.main.LoanApplication;
import com.dal.ca.rv.asdc.a1.main.MockAPI;

public class LoanApplicationTest {

    public int getCustomerIDTest() {
        LoanApplication loanApplication = new LoanApplication();
        String customerID = loanApplication.getCustomerID();
        if (customerID == null) {
            loanApplication.setCustomerID("CustomerIDGet");
            customerID = loanApplication.getCustomerID();
            if (customerID.equals("CustomerIDGet")) {
                System.out.println("getCustomerIDTest Passed!");
                return 1;
            } else {
                System.out.println("getCustomerIDTest Failed!");
                System.out.println("Expected: <CustomerIDGet> but was: <" + customerID + ">");
                return 0;
            }
        } else {
            System.out.println("getCustomerIDTest Failed!");
            System.out.println("Expected: <null> but was: <" + customerID + ">");
            return 0;
        }
    }

    public int setCustomerIDTest() {
        LoanApplication loanApplication = new LoanApplication();
        String customerID = loanApplication.getCustomerID();
        if (customerID == null) {
            loanApplication.setCustomerID("CustomerIDSet");
            customerID = loanApplication.getCustomerID();
            if (customerID.equals("CustomerIDSet")) {
                System.out.println("setCustomerIDTest Passed!");
                return 1;
            } else {
                System.out.println("setCustomerIDTest Failed!");
                System.out.println("Expected: <CustomerIDSet> but was: <" + customerID + ">");
                return 0;
            }
        } else {
            System.out.println("setCustomerIDTest Failed!");
            System.out.println("Expected: <null> but was: <" + customerID + ">");
            return 0;
        }
    }

    public int getCreditScoreTest() {
        LoanApplication loanApplication = new LoanApplication();
        int creditScore = loanApplication.getCreditScore();
        if (creditScore == 0) {
            loanApplication.setCreditScore(500);
            creditScore = loanApplication.getCreditScore();
            if (creditScore == 500) {
                System.out.println("getCreditScoreTest Passed!");
                return 1;
            } else {
                System.out.println("getCreditScoreTest Failed!");
                System.out.println("Expected: <500> but was: <" + creditScore + ">");
                return 0;
            }
        } else {
            System.out.println("getCreditScoreTest Failed!");
            System.out.println("Expected: <0> but was: <" + creditScore + ">");
            return 0;
        }
    }

    public int setCreditScoreTest() {
        LoanApplication loanApplication = new LoanApplication();
        int creditScore = loanApplication.getCreditScore();
        if (creditScore == 0) {
            loanApplication.setCreditScore(666);
            creditScore = loanApplication.getCreditScore();
            if (creditScore == 666) {
                System.out.println("setCreditScoreTest Passed!");
                return 1;
            } else {
                System.out.println("setCreditScoreTest Failed!");
                System.out.println("Expected: <666> but was: <" + creditScore + ">");
                return 0;
            }
        } else {
            System.out.println("setCreditScoreTest Failed!");
            System.out.println("Expected: <0> but was: <" + creditScore + ">");
            return 0;
        }
    }

    public int isEmployedTest() {
        LoanApplication loanApplication = new LoanApplication();
        boolean isEmployed = loanApplication.isEmployed();
        if (!isEmployed) {
            loanApplication.setEmployed(true);
            isEmployed = loanApplication.isEmployed();
            if (isEmployed) {
                loanApplication.setEmployed(false);
                isEmployed = loanApplication.isEmployed();
                if (!isEmployed) {
                    System.out.println("isEmployedTest Passed!");
                    return 1;
                } else {
                    System.out.println("isEmployedTest Failed!");
                    System.out.println("Expected: <false> after setting second time but was: <" + isEmployed + ">");
                    return 0;
                }
            } else {
                System.out.println("isEmployedTest Failed!");
                System.out.println("Expected: <true> but was: <" + isEmployed + ">");
                return 0;
            }
        } else {
            System.out.println("isEmployedTest Failed!");
            System.out.println("Expected: <false> but was: <" + isEmployed + ">");
            return 0;
        }
    }

    public int getAnnualIncomeTest() {
        LoanApplication loanApplication = new LoanApplication();
        double annualIncome = loanApplication.getAnnualIncome();
        if (annualIncome == 0) {
            loanApplication.setAnnualIncome(55000.50);
            annualIncome = loanApplication.getAnnualIncome();
            if (annualIncome == 55000.50) {
                System.out.println("getAnnualIncomeTest Passed!");
                return 1;
            } else {
                System.out.println("getAnnualIncomeTest Failed!");
                System.out.println("Expected: <55000.50> but was: <" + annualIncome + ">");
                return 0;
            }
        } else {
            System.out.println("getAnnualIncomeTest Failed!");
            System.out.println("Expected: <0> but was: <" + annualIncome + ">");
            return 0;
        }
    }

    public int setAnnualIncomeTest() {
        LoanApplication loanApplication = new LoanApplication();
        double annualIncome = loanApplication.getAnnualIncome();
        if (annualIncome == 0) {
            loanApplication.setAnnualIncome(88888);
            annualIncome = loanApplication.getAnnualIncome();
            if (annualIncome == 88888) {
                System.out.println("setAnnualIncomeTest Passed!");
                return 1;
            } else {
                System.out.println("setAnnualIncomeTest Failed!");
                System.out.println("Expected: <88888> but was: <" + annualIncome + ">");
                return 0;
            }
        } else {
            System.out.println("setAnnualIncomeTest Failed!");
            System.out.println("Expected: <0> but was: <" + annualIncome + ">");
            return 0;
        }
    }

    public int checkCreditScoreTestSuccess() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        int testResult;

        testResult = loans.checkCreditScore("customerid", mockAPI);

        if (testResult == 750) {
            System.out.println("checkCreditScoreTestSuccess Passed!");
            return 1;
        } else {
            System.out.println("checkCreditScoreTestSuccess Failed!");
            System.out.println("Expected: <750> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int checkCreditScoreTestSuccessBlankCustomerID() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        int testResult;

        testResult = loans.checkCreditScore("", mockAPI);

        if (testResult == 0) {
            System.out.println("checkCreditScoreTestSuccessBlankCustomerID Passed!");
            return 1;
        } else {
            System.out.println("checkCreditScoreTestSuccessBlankCustomerID Failed!");
            System.out.println("Expected: <0> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int checkCreditScoreTestUnknownCustomerID() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        int testResult;

        testResult = loans.checkCreditScore("unknownUser", mockAPI);

        if (testResult == 0) {
            System.out.println("checkCreditScoreTestUnknownCustomerID Passed!");
            return 1;
        } else {
            System.out.println("checkCreditScoreTestUnknownCustomerID Failed!");
            System.out.println("Expected: <0> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int checkLoanEligibilityTestSuccessWithNotEmployedIncomeBoundary() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        String testResult = "";

        loans.setCustomerID("customerid");
        loans.setEmployed(false);
        loans.setAnnualIncome(100000);

        testResult = loans.checkLoanEligibility(loans, true, mockAPI);

        if (testResult.equalsIgnoreCase("Success")) {
            System.out.println("checkLoanEligibilityTestSuccessWithNotEmployedIncomeBoundary Passed!");
            return 1;
        } else {
            System.out.println("checkLoanEligibilityTestSuccessWithNotEmployedIncomeBoundary Failed!");
            System.out.println("Expected: <SUCCESS> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int checkLoanEligibilityTestFailureWithNotEmployedIncomeBoundary() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        String testResult = "";

        loans.setCustomerID("customerid");
        loans.setEmployed(false);
        loans.setAnnualIncome(99999);

        testResult = loans.checkLoanEligibility(loans, true, mockAPI);

        if (testResult.equalsIgnoreCase("ANNUAL INCOME FOR NON-EMPLOYED OR BUSINESS PERSON IS LOWER THAN 100000")) {
            System.out.println("checkLoanEligibilityTestFailureWithNotEmployedIncomeBoundary Passed!");
            return 1;
        } else {
            System.out.println("checkLoanEligibilityTestFailureWithNotEmployedIncomeBoundary Failed!");
            System.out.println("Expected: <ANNUAL INCOME FOR NON-EMPLOYED OR BUSINESS PERSON IS LOWER THAN 100000> but was: <" + testResult + ">");
            return 0;
        }
    }


    public int checkLoanEligibilityTestSuccessWithEmployedIncomeBoundary() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        String testResult = "";

        loans.setCustomerID("customerid");
        loans.setEmployed(true);
        loans.setAnnualIncome(85000);

        testResult = loans.checkLoanEligibility(loans, true, mockAPI);

        if (testResult.equalsIgnoreCase("Success")) {
            System.out.println("checkLoanEligibilityTestSuccessWithEmployedIncomeBoundary Passed!");
            return 1;
        } else {
            System.out.println("checkLoanEligibilityTestSuccessWithEmployedIncomeBoundary Failed!");
            System.out.println("Expected: <SUCCESS> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int checkLoanEligibilityTestFailureWithEmployedIncomeBoundary() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        String testResult = "";

        loans.setCustomerID("customerid");
        loans.setEmployed(true);
        loans.setAnnualIncome(84999);

        testResult = loans.checkLoanEligibility(loans, true, mockAPI);

        if (testResult.equalsIgnoreCase("ANNUAL INCOME FOR EMPLOYED PERSON IS LOWER THAN 85000")) {
            System.out.println("checkLoanEligibilityTestFailureWithEmployedIncomeBoundary Passed!");
            return 1;
        } else {
            System.out.println("checkLoanEligibilityTestFailureWithEmployedIncomeBoundary Failed!");
            System.out.println("Expected: <ANNUAL INCOME FOR EMPLOYED PERSON IS LOWER THAN 85000> but was: <" + testResult + ">");
            return 0;
        }
    }

    //Feel free to play around with any of the hardcoded values like customerid, isEmployed, annualIncome
    public int checkLoanEligibilityTestSuccessWithBoundaryCreditScore() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        String testResult = "";

        loans.setCustomerID("boundarySuccessCustomer");
        loans.setEmployed(true);
        loans.setAnnualIncome(85000);

        testResult = loans.checkLoanEligibility(loans, true, mockAPI);

        if (testResult.equalsIgnoreCase("Success")) {
            System.out.println("checkLoanEligibilityTestSuccessWithBoundaryCreditScore Passed!");
            return 1;
        } else {
            System.out.println("checkLoanEligibilityTestSuccessWithBoundaryCreditScore Failed!");
            System.out.println("Expected: <SUCCESS> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int checkLoanEligibilityTestFailureWithBoundaryCreditScore() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        String testResult = "";

        loans.setCustomerID("boundaryFailureCustomer");
        loans.setEmployed(true);
        loans.setAnnualIncome(85000);

        testResult = loans.checkLoanEligibility(loans, true, mockAPI);

        if (testResult.equalsIgnoreCase("CREDIT SCORE IS LOWER THAN 700")) {
            System.out.println("checkLoanEligibilityTestFailureWithBoundaryCreditScore Passed!");
            return 1;
        } else {
            System.out.println("checkLoanEligibilityTestFailureWithBoundaryCreditScore Failed!");
            System.out.println("Expected: <CREDIT SCORE IS LOWER THAN 700> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int checkLoanEligibilityTestFailureWithUnknownCreditScore() {
        LoanApplication loans = new LoanApplication();
        ICreditScore mockAPI = new MockAPI();
        String testResult = "";

        loans.setCustomerID("unknownCreditScoreCustomer");
        loans.setEmployed(true);
        loans.setAnnualIncome(85000);

        testResult = loans.checkLoanEligibility(loans, true, mockAPI);

        if (testResult.equalsIgnoreCase("YOU HAVE NO CREDIT SCORE REPORT")) {
            System.out.println("checkLoanEligibilityTestFailureWithUnknownCreditScore Passed!");
            return 1;
        } else {
            System.out.println("checkLoanEligibilityTestFailureWithUnknownCreditScore Failed!");
            System.out.println("Expected: <YOU HAVE NO CREDIT SCORE REPORT> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int calculateInterestTestSuccess() {
        LoanApplication loans = new LoanApplication();
        double calculatedInterest;

        calculatedInterest = loans.calculateInterest(true, 15000, 10, 7.5);

        if (calculatedInterest == 11250) {
            System.out.println("calculateInterestTestSuccess Passed!");
            return 1;
        } else {
            System.out.println("calculateInterestTestSuccess Failed!");
            System.out.println("Expected: <11250> but was: <" + calculatedInterest + ">");
            return 0;
        }
    }

    public int calculateInterestTestZeroPrincipalAmount() {
        LoanApplication loans = new LoanApplication();
        double calculatedInterest;

        calculatedInterest = loans.calculateInterest(true, 0, 10, 7.5);

        if (calculatedInterest == 0) {
            System.out.println("calculateInterestTestZeroPrincipalAmount Passed!");
            return 1;
        } else {
            System.out.println("calculateInterestTestZeroPrincipalAmount Failed!");
            System.out.println("Expected: <0> but was: <" + calculatedInterest + ">");
            return 0;
        }
    }

    public int calculateInterestTestZeroLoanTerm() {
        LoanApplication loans = new LoanApplication();
        double calculatedInterest;

        calculatedInterest = loans.calculateInterest(true, 150000, 0, 7.5);

        if (calculatedInterest == 0) {
            System.out.println("calculateInterestTestZeroLoanTerm Passed!");
            return 1;
        } else {
            System.out.println("calculateInterestTestZeroLoanTerm Failed!");
            System.out.println("Expected: <0> but was: <" + calculatedInterest + ">");
            return 0;
        }
    }

    public int calculateInterestTestZeroROI() {
        LoanApplication loans = new LoanApplication();
        double calculatedInterest;

        calculatedInterest = loans.calculateInterest(true, 150000, 10, 0);

        if (calculatedInterest == 0) {
            System.out.println("calculateInterestTestZeroROI Passed!");
            return 1;
        } else {
            System.out.println("calculateInterestTestZeroROI Failed!");
            System.out.println("Expected: <0> but was: <" + calculatedInterest + ">");
            return 0;
        }
    }
}
