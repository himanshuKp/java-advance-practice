/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 6:06 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

class Person2{
    String name;
    Person2(){
        name="John";
    }

    public void getDetails(){
        System.out.println(name);
    }
}

class Employee2 extends Person2{
    int age;
    Employee2(){
        age=34;
    }
    public void getDetails(){
        System.out.println(name+age);
    }
}

class Customer2 extends Employee2{
    int salary;
    Customer2(int salary){
        this.salary=salary;
        name="Maddy";
    }

    public void getDetails(){
        System.out.println(name+age+salary);
    }
}

class Account {
    public static void main(String[] args) {
        Person2 c=new Customer2(20000);
        c.getDetails();
    }
}
