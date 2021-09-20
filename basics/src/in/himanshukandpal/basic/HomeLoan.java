/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 5:09 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class HomeLoan extends Loan{
    HomeLoan(){
        tenure = 5;
        principal = 20000;
        interestRate = 8.5f;
        accountNo = "123455";
    }

    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        double amount = homeLoan.calculateEMI();
        double result = homeLoan.calculateEMI(2, 1000.4);
        System.out.println("EMI Per year is: "+amount);
        System.out.println("EMI for 2 year: "+result);
    }
}
