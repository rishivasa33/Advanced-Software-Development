/************************************************************************************************
 @author : Rishi Vimal Vasa
 rishi.vasa@dal.ca
 B00902815

 Dalhousie University | Fall 2022 | Advanced Software Development Concepts | Assignment 01

 INSTRUCTIONS:
 • This program is a Demo Banking Application with a Loans Module to showcase the process of Test Driven Development
 • To run the program in the main flow, just execute --> javac *.java --> java Main
 • To run the program in the test flow, just execute --> javac *.java --> java Main test
 • The program is shipped with all test cases passing by default
 • The test cases can be manipulated to produce different outcomes by playing around with the hardcoded values
 • Note: Java version 17 or higher is required to compile this program succesfully (Java 18 is preferred)

 REFERENCES AND CITATIONS:
 [1] Oracle Javadocs for Enhanced Switch Case: https://docs.oracle.com/en/java/javase/13/language/switch-expressions.html
 [2] Professor Robert Hawkey's TDD Live Coding example is referred for the Login Module: https://git.cs.dal.ca/rhawkey/csci5308/-/tree/master/TDD/TutorialSampleCode/intellijtdd/src
 [3] TDD Wiki for the Process and Best Practices: https://en.wikipedia.org/wiki/Test-driven_development
 [4] Javatpoint for simple interest formula:  https://www.javatpoint.com/program-to-find-the-simple-interest
 *************************************************************************************************/

import com.dal.ca.rv.asdc.a1.main.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("TEST")) {
                System.out.println("'" + args[0] + "' argument Entered. Proceeding to Test Flow...");
                String testResults;
                MainTest test = new MainTest();
                testResults = test.mainTest();
                System.out.println(testResults);
                System.out.println("----------------------------------------------------------");
            } else {
                System.out.println(args[0] + " Entered, which is not a valid argument. Either enter 'Test' to proceed to Testing Flow, or do not enter any arguments to proceed to Main Flow");
            }
        } else if (args.length == 0) {
            System.out.println("Proceeding to Main Flow...");
            displayLoginMenu();
        } else {
            System.out.println("Invalid number of arguments present. Either enter 'Test' to proceed to Testing Flow, or do not enter any arguments to proceed to Main Flow");
        }
    }

    //Not adding test cases for private display menu methods (methods that are just driving the menu)
    private static void displayLoginMenu() {
        String loginResult;
        //Menu for Customer or Manager Login
        System.out.println("Welcome to RV Bank!\nPlease select the appropriate option: ");
        System.out.println("1. Manager Login");
        System.out.println("2. Customer Login");
        System.out.println("3. Exit");

        Scanner sc = new Scanner(System.in);
        int choice;
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    Manager manager = new Manager();
                    loginResult = manager.managerLogin(false, new MockDB());
                    System.out.println("\nManager Login Result: " + loginResult);
                    if (loginResult.equalsIgnoreCase("Success")) {
                        displayManagerMenu();
                    } else {
                        System.out.println(loginResult + ", Try Again\n");
                        displayLoginMenu();
                    }
                }
                case 2 -> {
                    Customer customer = new Customer();
                    loginResult = customer.customerLogin(false, new MockDB());
                    System.out.println("Customer Login Result: " + loginResult);
                    if (loginResult.equalsIgnoreCase("Success")) {
                        displayCustomerMenu();
                    } else {
                        System.out.println("Try Again\n");
                        displayLoginMenu();
                    }
                }
                case 3 -> System.out.println("Exiting...");
                default -> {
                    System.out.println("\nIncorrect input. Try Again\n");
                    displayLoginMenu();
                }
            }
        } else {
            System.out.println("\nIncorrect input. Try Again\n");
            displayLoginMenu();
        }
    }

    private static void displayManagerMenu() {
        //Manager Menu
        LoanProduct loanProduct = new LoanProduct();
        System.out.println("\nWelcome, Manager\nWhat would you like to do today? ");
        System.out.println("1. Browse Loan Products");
        System.out.println("2. Create new Loan Product");
        System.out.println("3. Log Out");

        Scanner sc = new Scanner(System.in);
        int choice;
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("\nLoans Products currently configured are: \n" + loanProduct.getLoanProducts(new MockDB()));
                    displayManagerMenu();
                }
                case 2 -> {
                    String createProductResult;
                    createProductResult = loanProduct.createLoanProduct(null, false, new MockDB());
                    System.out.println("\nCreate Loan Product Result: \n" + createProductResult);
                    displayManagerMenu();
                }
                case 3 -> {
                    System.out.println("\nLogged Out Successfully\n");
                    displayLoginMenu();
                }
                default -> {
                    System.out.println("\nIncorrect input. Try Again\n");
                    displayManagerMenu();
                }
            }
        } else {
            System.out.println("\nIncorrect input. Try Again\n");
            displayManagerMenu();
        }

    }

    private static void displayCustomerMenu() {
        //Customer Menu

        LoanProduct loanProduct = new LoanProduct();

        System.out.println("\nWhat would you like to do today? ");
        System.out.println("1. Browse Loan Products");
        System.out.println("2. Check Credit Score");
        System.out.println("3. Check Loan Eligibility");
        System.out.println("4. Calculate Interest");
        System.out.println("5. Log Out");

        Scanner sc = new Scanner(System.in);
        int choice;
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("\nOur Loan Products Catalogue: \n----------------------------\n" + loanProduct.getLoanProducts(new MockDB()));
                    displayCustomerMenu();
                }
                case 2 -> {
                    LoanApplication loans = new LoanApplication();
                    int creditScore;
                    //hardcoding customerID now, in real implementation it would be fetched from Session
                    String customerID = "customerid";
                    creditScore = loans.checkCreditScore(customerID, new MockAPI());
                    System.out.println("\nDear " + customerID + ", your Credit Score is: " + creditScore + "\n");
                    displayCustomerMenu();
                }
                case 3 -> {
                    LoanApplication loans = new LoanApplication();
                    String eligibilityResult;
                    //hardcoding customerID now, in real implementation it would be fetched from Session
                    //you can change this to "boundaryFailureCustomer" or any other random value to test failing scenario
                    loans.setCustomerID("customerid");
                    //Passing dummy values as parameters to the method as they are required during the test flow
                    eligibilityResult = loans.checkLoanEligibility(loans, false, new MockAPI());
                    System.out.println(eligibilityResult + "\n");
                    displayCustomerMenu();
                }
                case 4 -> {
                    LoanApplication loans = new LoanApplication();
                    loans.calculateInterest(false, 0, 0, 0);
                    displayCustomerMenu();
                }
                case 5 -> {
                    System.out.println("\nLogged Out Successfully\n");
                    displayLoginMenu();
                }
                default -> {
                    System.out.println("\nIncorrect input. Try Again\n");
                    displayCustomerMenu();
                }
            }
        } else {
            System.out.println("\nIncorrect input. Try Again\n");
            displayCustomerMenu();
        }
    }

}