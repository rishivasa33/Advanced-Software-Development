package com.dal.ca.rv.asdc.a1.main;

import java.util.List;

public interface ILoanProduct {

    List<LoanProduct> fetchLoanProductsFromMockDB();

    String addLoanProductToMockDB(LoanProduct newLoanProduct);
}