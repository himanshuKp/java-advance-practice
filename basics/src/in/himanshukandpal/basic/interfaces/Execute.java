/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/09/21, 3:54 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.interfaces;

public class Execute {
    public static void main(String[] args) {
        IBank bank = new MumbaiBranch();
        Customer customer = new Customer();
        customer.setCustomerId("cus10001");
        customer.setName("Himanshu");
        String accountNumber = bank.createAccount(customer);
        System.out.println("Accout number is: "+accountNumber);
        double gloan = bank.issueGoldLoan(customer);
        System.out.println("Gold loan amount is..." +gloan);
        double hloan = bank.issueHomeLoan(customer);
        System.out.println("House loan amount is..." +hloan);
        double vloan = bank.issueVehicleLoan("bike",customer);
        System.out.println("Vehicle loan amount is..." +vloan);
        System.out.println("Caution money is: "+IBank.CAUTION_MONEY);
        boolean creditCardRequest = bank.applyForCreditCard(customer);
        System.out.println("Applied for credit card: "+creditCardRequest);
    }
}
