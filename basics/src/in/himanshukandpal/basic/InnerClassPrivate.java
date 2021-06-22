/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/06/21, 11:51 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */
/* Java program to demonstrate whether we can override private method
   of outer class inside its inner class */
package in.himanshukandpal.basic;

public class InnerClassPrivate {
    private String message = "Geeks";
    private void fun(){
        System.out.println("Outer fun().");
    }
    class Inner extends InnerClassPrivate{
        private void fun(){
            System.out.println("Inner fun() with message: "+ message);
        }
    }

    public static void main(String[] args) {
//        In order to create inner class instance we need outer class instance
//        so first create outer class instance then inner class instance
        InnerClassPrivate outer = new InnerClassPrivate();
        Inner inner = outer.new Inner();

//        this will call inner fun().
//        the purpose of this call is to show that private member of outer class
//        can be accessed in inner class
        inner.fun();

        outer.fun();
    }
}
