/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/09/21, 3:52 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.interfaces;

public class MumbaiBranch implements IBank {
    @Override
    public String createAccount(Customer customer) {
        return "ABC123";
    }

    @Override
    public double issueVehicleLoan(String vehicleType, Customer customer) {
        if (vehicleType.equalsIgnoreCase("bike")){
            return 100000;
        }else {
            return 500000;
        }
    }

    @Override
    public double issueHomeLoan(Customer customer) {
        return 2000000;
    }

    @Override
    public double issueGoldLoan(Customer customer) {
        return 3000000;
    }

    @Override
    public void withdraw() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public boolean applyForCreditCard(Customer customer) {
        return true;
    }
}
