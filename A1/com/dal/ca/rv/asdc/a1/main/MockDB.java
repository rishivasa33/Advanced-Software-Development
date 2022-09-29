package com.dal.ca.rv.asdc.a1.main;

import java.util.ArrayList;
import java.util.List;

public class MockDB implements IAuthentication, ILoanProduct {
    @Override
    public String login(String managerId, String branchId, String password) {
        if (managerId == null || managerId.isEmpty() || branchId == null || branchId.isEmpty() || password == null || password.isEmpty()) {
            return "MANDATORY FIELDS MISSING";
        }
        if (managerId.equalsIgnoreCase("managerid")) {
            if (branchId.equalsIgnoreCase("halifax123")) {
                if (password.equals("password")) {
                    return "SUCCESS";
                } else {
                    return "INCORRECT PASSWORD";
                }
            } else {
                return "INCORRECT BRANCH ID";
            }
        } else {
            return "INCORRECT ID";
        }
    }

    @Override
    public String login(String customerId, String password) {
        if (customerId == null || customerId.isEmpty() || password == null || password.isEmpty()) {
            return "MANDATORY FIELDS MISSING";
        }
        if (customerId.equalsIgnoreCase("customerid")) {
            if (password.equals("password")) {
                return "SUCCESS";
            } else {
                return "INCORRECT PASSWORD";
            }
        } else {
            return "INCORRECT ID";
        }
    }

    public List<LoanProduct> fetchLoanProductsFromMockDB() {
        //Actual DB Logic to fetch records would go here, but hardcoding in Mock now
        List<LoanProduct> loanProducts = new ArrayList<>();
        LoanProduct product1 = new LoanProduct();
        LoanProduct product2 = new LoanProduct();

        product1.setLoanProductId("HL001");
        product1.setLoanProductName("House Loan 1");
        product1.setMaxLoanRepaymentTerm(10);
        product1.setMaxPrincipalAmount(1000000);
        product1.setRateOfInterest(5.8);
        loanProducts.add(product1);

        product2.setLoanProductId("VL002");
        product2.setLoanProductName("Vehicle Loan 2");
        product2.setMaxLoanRepaymentTerm(5);
        product2.setMaxPrincipalAmount(500000);
        product2.setRateOfInterest(8.5);
        loanProducts.add(product2);

        return loanProducts;
    }

    @Override
    public String addLoanProductToMockDB(LoanProduct newLoanProduct) {
        try {
            if (newLoanProduct.getLoanProductId() != null) {
                if (newLoanProduct.getLoanProductId().equalsIgnoreCase("HL001") ||
                        newLoanProduct.getLoanProductId().equalsIgnoreCase("VL002")) {
                    return "PRODUCT ALREADY EXISTS";
                } else if (newLoanProduct.getLoanProductId().length() < 3 || newLoanProduct.getLoanProductId().length() > 5) {
                    return "PRODUCT ID SHOULD BE BETWEEN 3 and 5 CHARACTERS";
                }
            } else {
                return "PRODUCT ID IS MANDATORY";
            }

            if (newLoanProduct.getLoanProductName() == null || newLoanProduct.getLoanProductName().isEmpty() || newLoanProduct.getLoanProductName().isBlank()) {
                return "PRODUCT NAME IS MANDATORY";
            }

            if (newLoanProduct.getRateOfInterest() <= 0) {
                return "RATE OF INTEREST SHOULD BE GREATER THAN 0";
            }

            if (newLoanProduct.getMaxLoanRepaymentTerm() <= 0) {
                return "MAX LOAN TERM SHOULD BE GREATER THAN 0";
            }

            if (newLoanProduct.getMaxPrincipalAmount() < 10000) {
                return "MAX PRINCIPAL AMOUNT SHOULD BE GREATER THAN 10000";
            }
        } catch (Exception e) {
            return "FAILED";
        }
        //Actual DB Logic to persist record would go here after validations, but using Mock now
        return "SUCCESS";
    }
}
