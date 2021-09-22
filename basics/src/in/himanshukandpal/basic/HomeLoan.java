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
       super(5,8.5f);
    }

    public double calculateEMI(double principal){
//        double simpleInterest = (principal * interestRate* tenure) / 100;
//        double emi = (simpleInterest + principal)/tenure;
        double emi = super.calculateEMI(1000.4);
         int additionalTax = 200;
         return emi + additionalTax;
    }

    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        double amount = homeLoan.calculateEMI();
        double result = homeLoan.calculateEMI(2, 1000.4);

        System.out.println("EMI Per year is: "+amount);
        System.out.println("EMI for 2 year: "+result);
        System.out.println("EMI for default years: "+homeLoan.calculateEMI(1000.4));
    }
}
