/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/09/21, 12:53 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.enums;

enum Designation{
    CEO(2),GeneralManager(4),RegionalManager(20);
    private int numberOfEmployees;
    Designation(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }
}

public class Bank {
    public static void main(String[] args) {
        Bank bank = new Bank();
//        bank.reportees(Designation.GeneralManager);
        for (Designation designation:Designation.values()){
            System.out.println(designation.name()+" : "+designation.getNumberOfEmployees());
        }
    }

    private void reportees(Designation generalManager) {
        System.out.println(generalManager.getNumberOfEmployees());
    }
}
