/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/07/21, 2:23 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.singleton;

public class Singleton3 {
    private static Singleton3 single_instance = null;

    public String s;

    private Singleton3() {
        s = "Hello I am a string part of singleton class.";
    }

    public static Singleton3 getInstance(){
        if (single_instance == null)
            single_instance = new Singleton3();

        return single_instance;
    }
}

class Main3 {
    public static void main(String[] args) {

        Singleton3 x = Singleton3.getInstance();

        Singleton3 y = Singleton3.getInstance();

        Singleton3 z = Singleton3.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println("String from x is: "+x.s);
        System.out.println("String from y is: "+y.s);
        System.out.println("String from z is: "+z.s+"\n");

        z.s = (z.s).toLowerCase();
        System.out.println("String from x is: "+x.s);
        System.out.println("String from y is: "+y.s);
        System.out.println("String from z is: "+z.s);
    }
}
