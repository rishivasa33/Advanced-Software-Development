import com.dal.ca.rv.asdc.a1.test.CustomerTest;
import com.dal.ca.rv.asdc.a1.test.LoanApplicationTest;
import com.dal.ca.rv.asdc.a1.test.LoanProductTest;
import com.dal.ca.rv.asdc.a1.test.ManagerTest;

public class MainTest {
    private static int countPassedTests = 0;
    private static int countTotalTests = 0;

    public String mainTest() {
        /* Calling all test methods sequentially.
        This process is extremely raw, and can be avoided with JUnit's @Test */

        System.out.println("----------------------------------------------------------");
        System.out.println("Manager Tests");
        System.out.println("----------------------------------------------------------");
        ManagerTest managerTest = new ManagerTest();

        countPassedTests += managerTest.getManagerIdTest();
        countTotalTests++;

        countPassedTests += managerTest.setManagerIdTest();
        countTotalTests++;

        countPassedTests += managerTest.getBranchIdTest();
        countTotalTests++;

        countPassedTests += managerTest.setBranchIdTest();
        countTotalTests++;

        countPassedTests += managerTest.getPasswordTest();
        countTotalTests++;

        countPassedTests += managerTest.setPasswordTest();
        countTotalTests++;

        countPassedTests += managerTest.managerLoginTestSuccess();
        countTotalTests++;

        countPassedTests += managerTest.managerLoginTestIncorrectID();
        countTotalTests++;

        countPassedTests += managerTest.managerLoginTestIncorrectBranch();
        countTotalTests++;

        countPassedTests += managerTest.managerLoginTestIncorrectPassword();
        countTotalTests++;


        System.out.println("----------------------------------------------------------");
        System.out.println("Customer Tests");
        System.out.println("----------------------------------------------------------");
        CustomerTest customerTest = new CustomerTest();

        countPassedTests += customerTest.getCustomerIdTest();
        countTotalTests++;

        countPassedTests += customerTest.setCustomerIdTest();
        countTotalTests++;

        countPassedTests += customerTest.getPasswordTest();
        countTotalTests++;

        countPassedTests += customerTest.setPasswordTest();
        countTotalTests++;

        countPassedTests += customerTest.getAccountTypeTest();
        countTotalTests++;

        countPassedTests += customerTest.setAccountTypeTest();
        countTotalTests++;

        countPassedTests += customerTest.getAccountNoTest();
        countTotalTests++;

        countPassedTests += customerTest.setAccountNoTest();
        countTotalTests++;

        countPassedTests += customerTest.customerLoginTestSuccess();
        countTotalTests++;

        countPassedTests += customerTest.customerLoginTestIncorrectID();
        countTotalTests++;

        countPassedTests += customerTest.customerLoginTestIncorrectPassword();
        countTotalTests++;


        System.out.println("----------------------------------------------------------");
        System.out.println("Loan Product Management Tests");
        System.out.println("----------------------------------------------------------");
        LoanProductTest loanProductTest = new LoanProductTest();

        countPassedTests += loanProductTest.getLoanProductIdTest();
        countTotalTests++;

        countPassedTests += loanProductTest.setLoanProductIdTest();
        countTotalTests++;

        countPassedTests += loanProductTest.getLoanProductNameTest();
        countTotalTests++;

        countPassedTests += loanProductTest.setLoanProductNameTest();
        countTotalTests++;

        countPassedTests += loanProductTest.getRateOfInterestTest();
        countTotalTests++;

        countPassedTests += loanProductTest.setRateOfInterestTest();
        countTotalTests++;

        countPassedTests += loanProductTest.getMaxPrincipalAmountTest();
        countTotalTests++;

        countPassedTests += loanProductTest.setMaxPrincipalAmountTest();
        countTotalTests++;

        countPassedTests += loanProductTest.getMaxLoanRepaymentTermTest();
        countTotalTests++;

        countPassedTests += loanProductTest.setMaxLoanRepaymentTermTest();
        countTotalTests++;

        countPassedTests += loanProductTest.getLoanProductsTest();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestSuccess();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestExistingProduct();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestIncorrectProductIDLength();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestBlankProductID();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestNullProductID();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestNullProductName();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestBlankProductName();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestIncorrectROI();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestNullROI();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestIncorrectMaxLoanRepayTerm();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestNullMaxLoanRepayTerm();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestIncorrectMaxPrincipalAmount();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestNullMaxPrincipalAmount();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestSuccessWithBoundaryValues();
        countTotalTests++;

        countPassedTests += loanProductTest.createLoanProductTestSuccessAfterRepeatedBadInputs();
        countTotalTests++;


        System.out.println("----------------------------------------------------------");
        System.out.println("Loan Application Tests");
        System.out.println("----------------------------------------------------------");
        LoanApplicationTest loan = new LoanApplicationTest();

        countPassedTests += loan.getCustomerIDTest();
        countTotalTests++;

        countPassedTests += loan.setCustomerIDTest();
        countTotalTests++;

        countPassedTests += loan.getCreditScoreTest();
        countTotalTests++;

        countPassedTests += loan.setCreditScoreTest();
        countTotalTests++;

        countPassedTests += loan.isEmployedTest();
        countTotalTests++;

        countPassedTests += loan.getAnnualIncomeTest();
        countTotalTests++;

        countPassedTests += loan.setAnnualIncomeTest();
        countTotalTests++;

        countPassedTests += loan.checkCreditScoreTestSuccess();
        countTotalTests++;

        countPassedTests += loan.checkCreditScoreTestSuccessBlankCustomerID();
        countTotalTests++;

        countPassedTests += loan.checkCreditScoreTestUnknownCustomerID();
        countTotalTests++;

        countPassedTests += loan.checkLoanEligibilityTestSuccessWithNotEmployedIncomeBoundary();
        countTotalTests++;

        countPassedTests += loan.checkLoanEligibilityTestFailureWithNotEmployedIncomeBoundary();
        countTotalTests++;

        countPassedTests += loan.checkLoanEligibilityTestSuccessWithEmployedIncomeBoundary();
        countTotalTests++;

        countPassedTests += loan.checkLoanEligibilityTestFailureWithEmployedIncomeBoundary();
        countTotalTests++;

        countPassedTests += loan.checkLoanEligibilityTestSuccessWithBoundaryCreditScore();
        countTotalTests++;

        countPassedTests += loan.checkLoanEligibilityTestFailureWithBoundaryCreditScore();
        countTotalTests++;

        countPassedTests += loan.checkLoanEligibilityTestFailureWithUnknownCreditScore();
        countTotalTests++;

        countPassedTests += loan.calculateInterestTestSuccess();
        countTotalTests++;

        countPassedTests += loan.calculateInterestTestZeroPrincipalAmount();
        countTotalTests++;

        countPassedTests += loan.calculateInterestTestZeroLoanTerm();
        countTotalTests++;

        countPassedTests += loan.calculateInterestTestZeroROI();
        countTotalTests++;

        System.out.println("\n----------------------------------------------------------");
        return "Testing Completed with " + countPassedTests + "/" + countTotalTests + " test cases passed";
    }
}