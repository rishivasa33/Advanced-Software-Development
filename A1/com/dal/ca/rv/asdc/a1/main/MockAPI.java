package com.dal.ca.rv.asdc.a1.main;



public class MockAPI implements ICreditScore {

    public int fetchCreditScoreFromAPI(String customerID) {
        //Actual API call to fetch credit score would go here, but hardcoding in Mock now
        int creditScore;
        if (customerID != null) {
            creditScore = switch (customerID) {
                case "customerid" -> 750;
                case "boundarySuccessCustomer" -> 700;
                case "boundaryFailureCustomer" -> 699;
                default -> 0;
            };
        } else{
            return 0;
        }
        return creditScore;
    }

}
