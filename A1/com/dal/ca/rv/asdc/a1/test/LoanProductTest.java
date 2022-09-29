package com.dal.ca.rv.asdc.a1.test;

import com.dal.ca.rv.asdc.a1.main.MockDB;
import com.dal.ca.rv.asdc.a1.main.ILoanProduct;
import com.dal.ca.rv.asdc.a1.main.LoanProduct;

import java.util.List;

public class LoanProductTest {

    public int getLoanProductIdTest() {
        LoanProduct product = new LoanProduct();
        String productID = product.getLoanProductId();
        if (productID == null) {
            product.setLoanProductId("LnProdIDTestGet");
            productID = product.getLoanProductId();
            if (productID.equals("LnProdIDTestGet")) {
                System.out.println("getLoanProductIdTest Passed!");
                return 1;
            } else {
                System.out.println("getLoanProductIdTest Failed!");
                System.out.println("Expected: <LnProdIDTestGet> but was: <" + productID + ">");
                return 0;
            }
        } else {
            System.out.println("getLoanProductIdTest Failed!");
            System.out.println("Expected: <null> but was: <" + productID + ">");
            return 0;
        }
    }

    public int setLoanProductIdTest() {
        LoanProduct product = new LoanProduct();
        String productID = product.getLoanProductId();
        if (productID == null) {
            product.setLoanProductId("LnProdIDTestSet");
            productID = product.getLoanProductId();
            if (productID.equals("LnProdIDTestSet")) {
                System.out.println("setLoanProductIdTest Passed!");
                return 1;
            } else {
                System.out.println("setLoanProductIdTest Failed!");
                System.out.println("Expected: <LnProdIDTestSet> but was: <" + productID + ">");
                return 0;
            }
        } else {
            System.out.println("setLoanProductIdTest Failed!");
            System.out.println("Expected: <null> but was: <" + productID + ">");
            return 0;
        }
    }

    public int getLoanProductNameTest() {
        LoanProduct product = new LoanProduct();
        String productName = product.getLoanProductName();
        if (productName == null) {
            product.setLoanProductName("LnProdNameTestGet");
            productName = product.getLoanProductName();
            if (productName.equals("LnProdNameTestGet")) {
                System.out.println("getLoanProductNameTest Passed!");
                return 1;
            } else {
                System.out.println("getLoanProductNameTest Failed!");
                System.out.println("Expected: <LnProdNameTestGet> but was: <" + productName + ">");
                return 0;
            }
        } else {
            System.out.println("getLoanProductNameTest Failed!");
            System.out.println("Expected: <null> but was: <" + productName + ">");
            return 0;
        }
    }

    public int setLoanProductNameTest() {
        LoanProduct product = new LoanProduct();
        String productName = product.getLoanProductName();
        if (productName == null) {
            product.setLoanProductName("LnProdNameTestSet");
            productName = product.getLoanProductName();
            if (productName.equals("LnProdNameTestSet")) {
                System.out.println("setLoanProductNameTest Passed!");
                return 1;
            } else {
                System.out.println("setLoanProductNameTest Failed!");
                System.out.println("Expected: <LnProdNameTestSet> but was: <" + productName + ">");
                return 0;
            }
        } else {
            System.out.println("setLoanProductNameTest Failed!");
            System.out.println("Expected: <null> but was: <" + productName + ">");
            return 0;
        }
    }

    public int getRateOfInterestTest() {
        LoanProduct product = new LoanProduct();
        double rateOfInterest = product.getRateOfInterest();
        if (rateOfInterest == 0.0) {
            product.setRateOfInterest(5.5);
            rateOfInterest = product.getRateOfInterest();
            if (rateOfInterest == 5.5) {
                System.out.println("getRateOfInterestTest Passed!");
                return 1;
            } else {
                System.out.println("getRateOfInterestTest Failed!");
                System.out.println("Expected: <5.5> but was: <" + rateOfInterest + ">");
                return 0;
            }
        } else {
            System.out.println("getRateOfInterestTest Failed!");
            System.out.println("Expected: <0.0> but was: <" + rateOfInterest + ">");
            return 0;
        }
    }

    public int setRateOfInterestTest() {
        LoanProduct product = new LoanProduct();
        double rateOfInterest = product.getRateOfInterest();
        if (rateOfInterest == 0) {
            product.setRateOfInterest(8.2);
            rateOfInterest = product.getRateOfInterest();
            if (rateOfInterest == 8.2) {
                System.out.println("setRateOfInterestTest Passed!");
                return 1;
            } else {
                System.out.println("setRateOfInterestTest Failed!");
                System.out.println("Expected: <8.2> but was: <" + rateOfInterest + ">");
                return 0;
            }
        } else {
            System.out.println("setRateOfInterestTest Failed!");
            System.out.println("Expected: <0.0> but was: <" + rateOfInterest + ">");
            return 0;
        }
    }

    public int getMaxPrincipalAmountTest() {
        LoanProduct product = new LoanProduct();
        double maxLoanAmount = product.getMaxPrincipalAmount();
        if (maxLoanAmount == 0.0) {
            product.setMaxPrincipalAmount(50000.50);
            maxLoanAmount = product.getMaxPrincipalAmount();
            if (maxLoanAmount == 50000.50) {
                System.out.println("getMaxPrincipalAmountTest Passed!");
                return 1;
            } else {
                System.out.println("getMaxPrincipalAmountTest Failed!");
                System.out.println("Expected: <50000.50> but was: <" + maxLoanAmount + ">");
                return 0;
            }
        } else {
            System.out.println("getMaxPrincipalAmountTest Failed!");
            System.out.println("Expected: <0.0> but was: <" + maxLoanAmount + ">");
            return 0;
        }
    }

    public int setMaxPrincipalAmountTest() {
        LoanProduct product = new LoanProduct();
        double maxLoanAmount = product.getMaxPrincipalAmount();
        if (maxLoanAmount == 0) {
            product.setMaxPrincipalAmount(800000.25);
            maxLoanAmount = product.getMaxPrincipalAmount();
            if (maxLoanAmount == 800000.25) {
                System.out.println("setMaxPrincipalAmountTest Passed!");
                return 1;
            } else {
                System.out.println("setMaxPrincipalAmountTest Failed!");
                System.out.println("Expected: <800000.25> but was: <" + maxLoanAmount + ">");
                return 0;
            }
        } else {
            System.out.println("setMaxPrincipalAmountTest Failed!");
            System.out.println("Expected: <0.0> but was: <" + maxLoanAmount + ">");
            return 0;
        }
    }

    public int getMaxLoanRepaymentTermTest() {
        LoanProduct product = new LoanProduct();
        int maxLoanTerm = product.getMaxLoanRepaymentTerm();
        if (maxLoanTerm == 0) {
            product.setMaxLoanRepaymentTerm(10);
            maxLoanTerm = product.getMaxLoanRepaymentTerm();
            if (maxLoanTerm == 10) {
                System.out.println("getMaxLoanRepaymentTermTest Passed!");
                return 1;
            } else {
                System.out.println("getMaxLoanRepaymentTermTest Failed!");
                System.out.println("Expected: <10> but was: <" + maxLoanTerm + ">");
                return 0;
            }
        } else {
            System.out.println("getMaxLoanRepaymentTermTest Failed!");
            System.out.println("Expected: <0> but was: <" + maxLoanTerm + ">");
            return 0;
        }
    }

    public int setMaxLoanRepaymentTermTest() {
        LoanProduct product = new LoanProduct();
        int maxLoanTerm = product.getMaxLoanRepaymentTerm();
        if (maxLoanTerm == 0) {
            product.setMaxLoanRepaymentTerm(20);
            maxLoanTerm = product.getMaxLoanRepaymentTerm();
            if (maxLoanTerm == 20) {
                System.out.println("setMaxLoanRepaymentTermTest Passed!");
                return 1;
            } else {
                System.out.println("setMaxLoanRepaymentTermTest Failed!");
                System.out.println("Expected: <20> but was: <" + maxLoanTerm + ">");
                return 0;
            }
        } else {
            System.out.println("setMaxLoanRepaymentTermTest Failed!");
            System.out.println("Expected: <0> but was: <" + maxLoanTerm + ">");
            return 0;
        }
    }

    public int getLoanProductsTest() {
        LoanProduct product = new LoanProduct();
        List<LoanProduct> loanProducts;
        ILoanProduct dbMock = new MockDB();
        loanProducts = product.getLoanProducts(dbMock);

        // Verifying if data was fetched and if the list is not null.
        // It CAN be empty if there are no actual records in the DB, so isEmpty check is not made
        if (loanProducts == null) {
            System.out.println("getLoanProductsTest Failed! Null returned");
            return 0;
        } else {
            //for(int i = 0; i<loanProducts.size(); i++){
            if (loanProducts.get(0).getLoanProductId().equalsIgnoreCase("HL001")) {
                if (loanProducts.get(1).getLoanProductId().equalsIgnoreCase("VL002")) {
                    System.out.println("getLoanProductsTest Passed!");
                    return 1;
                } else {
                    System.out.println("getLoanProductsTest Failed!");
                    System.out.println("Expected: <VL002> but was: <" + loanProducts.get(1).loanProductId + ">");
                    return 0;
                }
            } else {
                System.out.println("getLoanProductsTest Failed!");
                System.out.println("Expected: <HL001> but was: <" + loanProducts.get(0).loanProductId + ">");
                return 0;
            }
            //}
        }
    }

    public int createLoanProductTestSuccess() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setLoanProductName("Education Loan 3");
        product.setMaxLoanRepaymentTerm(8);
        product.setMaxPrincipalAmount(40000);
        product.setRateOfInterest(7);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("Success")) {
            System.out.println("createLoanProductTestSuccess Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestSuccess Failed!");
            System.out.println("Expected: <SUCCESS> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestExistingProduct() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("VL002");
        product.setLoanProductName("Vehicle Loan 2");
        product.setMaxLoanRepaymentTerm(5);
        product.setMaxPrincipalAmount(20000);
        product.setRateOfInterest(9.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("PRODUCT ALREADY EXISTS")) {
            System.out.println("createLoanProductTestExistingProduct Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestExistingProduct Failed!");
            System.out.println("Expected: <PRODUCT ALREADY EXISTS> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestIncorrectProductIDLength() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EDLOAN001");
        product.setLoanProductName("Education Loan 1");
        product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(300000);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("PRODUCT ID SHOULD BE BETWEEN 3 and 5 CHARACTERS")) {
            System.out.println("createLoanProductTestIncorrectProductIDLength Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestIncorrectProductIDLength Failed!");
            System.out.println("Expected: <PRODUCT ID SHOULD BE BETWEEN 3 and 5 CHARACTERS> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestBlankProductID() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("");
        product.setLoanProductName("Education Loan 1");
        product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(300000);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("PRODUCT ID SHOULD BE BETWEEN 3 and 5 CHARACTERS")) {
            System.out.println("createLoanProductTestBlankProductID Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestBlankProductID Failed!");
            System.out.println("Expected: <PRODUCT ID IS MANDATORY> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestNullProductID() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductName("Education Loan 1");
        product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(300000);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("PRODUCT ID IS MANDATORY")) {
            System.out.println("createLoanProductTestNullProductID Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestNullProductID Failed!");
            System.out.println("Expected: <PRODUCT ID IS MANDATORY> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestBlankProductName() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setLoanProductName("");
        product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(300000);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("PRODUCT NAME IS MANDATORY")) {
            System.out.println("createLoanProductTestBlankProductName Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestBlankProductName Failed!");
            System.out.println("Expected: <PRODUCT NAME IS MANDATORY> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestNullProductName() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(300000);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("PRODUCT NAME IS MANDATORY")) {
            System.out.println("createLoanProductTestNullProductName Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestNullProductName Failed!");
            System.out.println("Expected: <PRODUCT NAME IS MANDATORY> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestIncorrectROI() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setLoanProductName("Education Loan 3");
        product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(300000);
        product.setRateOfInterest(0);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("RATE OF INTEREST SHOULD BE GREATER THAN 0")) {
            System.out.println("createLoanProductTestIncorrectROI Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestIncorrectROI Failed!");
            System.out.println("Expected: <RATE OF INTEREST SHOULD BE GREATER THAN 0> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestNullROI() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setLoanProductName("Education Loan 3");
        product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(300000);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("RATE OF INTEREST SHOULD BE GREATER THAN 0")) {
            System.out.println("createLoanProductTestNullROI Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestNullROI Failed!");
            System.out.println("Expected: <RATE OF INTEREST SHOULD BE GREATER THAN 0> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestIncorrectMaxLoanRepayTerm() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setLoanProductName("Education Loan 3");
        product.setMaxLoanRepaymentTerm(0);
        product.setMaxPrincipalAmount(300000);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("MAX LOAN TERM SHOULD BE GREATER THAN 0")) {
            System.out.println("createLoanProductTestIncorrectMaxLoanRepayTerm Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestIncorrectMaxLoanRepayTerm Failed!");
            System.out.println("Expected: <MAX LOAN TERM SHOULD BE GREATER THAN 0> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestNullMaxLoanRepayTerm() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setLoanProductName("Education Loan 3");
        product.setMaxPrincipalAmount(300000);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("MAX LOAN TERM SHOULD BE GREATER THAN 0")) {
            System.out.println("createLoanProductTestNullMaxLoanRepayTerm Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestNullMaxLoanRepayTerm Failed!");
            System.out.println("Expected: <MAX LOAN TERM SHOULD BE GREATER THAN 0> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestIncorrectMaxPrincipalAmount() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setLoanProductName("Education Loan 3");
        product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(9999);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("MAX PRINCIPAL AMOUNT SHOULD BE GREATER THAN 10000")) {
            System.out.println("createLoanProductTestIncorrectMaxPrincipalAmount Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestIncorrectMaxPrincipalAmount Failed!");
            System.out.println("Expected: <MAX PRINCIPAL AMOUNT SHOULD BE GREATER THAN 10000> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestNullMaxPrincipalAmount() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003");
        product.setLoanProductName("Education Loan 3");
        product.setMaxLoanRepaymentTerm(10);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("MAX PRINCIPAL AMOUNT SHOULD BE GREATER THAN 10000")) {
            System.out.println("createLoanProductTestNullMaxPrincipalAmount Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestNullMaxPrincipalAmount Failed!");
            System.out.println("Expected: <MAX PRINCIPAL AMOUNT SHOULD BE GREATER THAN 10000> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestSuccessAfterRepeatedBadInputs() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        //Incorrect Input 1
        product.setLoanProductId("EL003");
        product.setLoanProductName("Education Loan 3");
        //product.setMaxLoanRepaymentTerm(10);
        product.setMaxPrincipalAmount(9999);
        product.setRateOfInterest(5.2);

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("MAX LOAN TERM SHOULD BE GREATER THAN 0")) {
            //Incorrect Input 2
            product.setLoanProductId("EL003");
            product.setLoanProductName("Education Loan 3");
            product.setMaxLoanRepaymentTerm(10);
            //product.setMaxPrincipalAmount(9999);
            product.setRateOfInterest(5.2);

            testResult = product.createLoanProduct(product, true, dbMock);

            if (testResult.equalsIgnoreCase("MAX PRINCIPAL AMOUNT SHOULD BE GREATER THAN 10000")) {
                //Correct Input
                product.setLoanProductId("EL003");
                product.setLoanProductName("Education Loan 3");
                product.setMaxLoanRepaymentTerm(10);
                product.setMaxPrincipalAmount(10000);
                product.setRateOfInterest(5.2);

                testResult = product.createLoanProduct(product, true, dbMock);

                if (testResult.equalsIgnoreCase("Success")) {
                    System.out.println("createLoanProductTestSuccessAfterRepeatedBadInputs Passed!");
                    return 1;
                } else {
                    System.out.println("createLoanProductTestSuccessAfterRepeatedBadInputs Failed!");
                    System.out.println("Expected: <SUCCESS> but was: <" + testResult + ">");
                    return 0;
                }

            } else {
                System.out.println("createLoanProductTestSuccessAfterRepeatedBadInputs Failed!");
                System.out.println("Expected: <MAX PRINCIPAL AMOUNT SHOULD BE GREATER THAN 10000> but was: <" + testResult + ">");
                return 0;
            }

        } else {
            System.out.println("createLoanProductTestSuccessAfterRepeatedBadInputs Failed!");
            System.out.println("Expected: <MAX LOAN TERM SHOULD BE GREATER THAN 0> but was: <" + testResult + ">");
            return 0;
        }
    }

    public int createLoanProductTestSuccessWithBoundaryValues() {
        LoanProduct product = new LoanProduct();
        String testResult;
        ILoanProduct dbMock = new MockDB();

        product.setLoanProductId("EL003"); //Between 3 and 5 Characters
        product.setLoanProductName("Education Loan 3"); //Not Null
        product.setMaxLoanRepaymentTerm(1); //Greater than 0
        product.setMaxPrincipalAmount(10000);//Greater than or equal to 10000
        product.setRateOfInterest(0.1);//Greater than 0

        testResult = product.createLoanProduct(product, true, dbMock);

        if (testResult.equalsIgnoreCase("Success")) {
            System.out.println("createLoanProductTestSuccessWithBoundaryValues Passed!");
            return 1;
        } else {
            System.out.println("createLoanProductTestSuccessWithBoundaryValues Failed!");
            System.out.println("Expected: <SUCCESS> but was: <" + testResult + ">");
            return 0;
        }
    }
}
