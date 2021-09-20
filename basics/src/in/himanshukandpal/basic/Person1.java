/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 6:02 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

class Person1{
    String name;
    Person1(){
        name="John";
    }

    public void getDetails(){
        System.out.println(name);
    }
}

class Employee extends Person1{
    int age;
    Employee(){
        age=34;
        name="maddy";
    }
    public void getDetails(){
        System.out.println(name+age);
    }
}

class Customer extends Employee{
    int salary;
    Customer(int salary){
        this.salary=salary;
//        this.name="himMaddy";
    }

    public void getDetails(){
        System.out.println(name+age+salary);
    }
}

class Account1 {
    public static void main(String[] args) {
        Person1 c=new Customer(20000);
        c.getDetails();
    }
}
