package com.dal.ca.rv.asdc.a1.main;

public interface IAuthentication {

    String login(String managerId, String branchId, String password);

    String login(String customerId, String password);
}
