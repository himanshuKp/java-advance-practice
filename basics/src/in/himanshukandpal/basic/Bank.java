/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 3:44 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class Bank {
    String bankName;
    String area;
    String phoneNo;
    public static void main(String[] args){
        Bank bank2=new Bank("abc","xyz","pqr");
        System.out.println(bank2.bankName);
        System.out.println(bank2.area);

    }
    Bank(String bankName,String area,String phoneNo){
        bankName=bankName;
        this.area=area;
    }
}
