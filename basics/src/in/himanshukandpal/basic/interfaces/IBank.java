/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/09/21, 3:48 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.interfaces;

public interface IBank extends IBankNew{
    int CAUTION_MONEY = 2000;
    String createAccount(Customer customer);
    double issueVehicleLoan(String vehicleType, Customer customer);
    double issueHomeLoan(Customer customer);
    double issueGoldLoan(Customer customer);
    void withdraw();
    void deposit();
}
