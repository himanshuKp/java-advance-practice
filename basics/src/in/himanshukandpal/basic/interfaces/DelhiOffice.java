/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/09/21, 4:09 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.interfaces;

public class DelhiOffice extends Office{
    @Override
    public String createAccount(Customer customer) {
        return null;
    }

    @Override
    public double issueVehicleLoan(String vehicleType, Customer customer) {
        return 0;
    }

    @Override
    public double issueHomeLoan(Customer customer) {
        return 0;
    }

    @Override
    public double issueGoldLoan(Customer customer) {
        return 0;
    }

    @Override
    public void deposit() {
        System.out.println("Account deposit");
    }

    @Override
    public boolean applyForCreditCard(Customer customer) {
        return false;
    }
}
