/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 5:54 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class Loan1{
    public double calculateEMI(double principal){
        double simpleInterest = (principal * 8.5 * 5) / 100;
        return (simpleInterest+principal)/5;
    }
}

class HomeLoan1 extends Loan1 {
    // method overriden
    public double calculateEMI(double principal){
        int additionalTax = 200;
        double simpleInterest = (principal * 7.5 * 20) / 100;
        double emi = (simpleInterest + principal) / 20;
        return emi+additionalTax;
    }
}

class VehicleLoan1 extends Loan1 {
    // method overriden
    public double calculateEMI(double principal){
        int additionalTax = 400;
        double simpleInterest = (principal * 9.5 * 10) / 100;
        double emi = (simpleInterest + principal) / 10;
        return emi+additionalTax;
    }
}

class ExecuteLoan{
    public static void main(String[] args){
        Loan1 loan = null;
        loan = new HomeLoan1();      //Runtime Polymorphism
        double hloan = loan.calculateEMI(2000000);
        loan = new VehicleLoan1();   //sup class reference holding sub class Object
        double vloan = loan.calculateEMI(100000);
        System.out.println("Home loan emi per year is..." + hloan);
        System.out.println("Vehicle loan emi per year is..." + vloan);

    }
}