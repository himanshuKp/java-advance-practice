/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 8:35 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class Loan {
    int tenure;
    double principal;
    float interestRate;
    String accountNo;

    public Loan(int tenure, float interestRate) {
        this.tenure = tenure;
        this.interestRate = interestRate;
    }

    public double calculateEMI(){
        double simpleInterest = (principal*interestRate*tenure)/100;
        return (simpleInterest+principal)/tenure;
    }

    public double calculateEMI(double principal){
        double simpleInterest = (principal*interestRate*tenure)/100;
        return (simpleInterest+principal)/tenure;
    }

    public double calculateEMI(int tenure, double principal){
        double simpleInterest = (principal*interestRate*tenure)/100;
        return (simpleInterest+principal)/tenure;
    }

    public double calculateEMI(double principal, int tenure){
        double simpleInterest = (principal*interestRate*tenure)/100;
        return (simpleInterest+principal)/tenure;
    }

    public double calculateEMI(int tenure, double principal, float interest){
        double simpleInterest = (principal*interest*tenure)/100;
        return (simpleInterest+principal)/tenure;
    }
}
