/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 04/07/21, 7:08 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.objectmapping;

/*
* Java program to illustrate the
* concept of association
* */

//class bank
class Bank {
    private String name;

    Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

/*Association between both the classes
* in main method
* Bank can have many employees, So it is a one-to-many relationship.
* */
public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        Employee employee = new Employee("Neha");

        System.out.println(bank.getName()+" is employee of "+employee.getName());
    }
}
