/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/07/21, 9:55 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.singleton;

public class Singleton2 {
//    variable of type string
    public String s;

//    private constructor restricted to this class itself
    private Singleton2() {
        s = "Hello I am a string part of singleton class.";
    }

//    inner class to provide instance of class
    private static class BillPughSingleton {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

//    static method to create instance of singleton class
    public static Singleton2 getInstance(){
        return BillPughSingleton.INSTANCE;
    }
}

class Driver2 {
    public static void main(String[] args) {
//        instantiating singleton class with variable x
        Singleton2 x = Singleton2.getInstance();

//        instantiating singleton class with variable y
        Singleton2 y = Singleton2.getInstance();

//        instantiating singleton class with variable z
        Singleton2 z = Singleton2.getInstance();

//        changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is: "+x.s);
        System.out.println("String from y is: "+y.s);
        System.out.println("String from z is: "+z.s+"\n");

//        changing variable of instance z
        z.s = (z.s).toLowerCase();
        System.out.println("String from x is: "+x.s);
        System.out.println("String from y is: "+y.s);
        System.out.println("String from z is: "+z.s+"\n");
    }
}