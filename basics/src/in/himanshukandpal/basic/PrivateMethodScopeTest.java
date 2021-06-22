/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/06/21, 9:17 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

class Base {
    public void fun(){
        System.out.println("Base fun.");
    }
//    private void fun(){
//        System.out.println("Base fun.");
//    }
}

public class PrivateMethodScopeTest extends Base{
    public void fun(){
        System.out.println("Derived fun.");
    }
//    private void fun(){
//        System.out.println("Derived fun.");
//    }

    public static void main(String[] args) {
        Base obj = new PrivateMethodScopeTest();
        obj.fun();
    }
}