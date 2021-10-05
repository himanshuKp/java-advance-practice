/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/10/21, 3:01 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.java8.staticmethods;

interface Deduction1 {
    static void deduct(){
        System.out.println("Deduct");
    }
}

class Customer1 implements Deduction1 {
    public static void deduct(){;
        System.out.println("Deduction for customer");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Customer1 deduction1 = new Customer1();
        Customer1.deduct();
    }
}
