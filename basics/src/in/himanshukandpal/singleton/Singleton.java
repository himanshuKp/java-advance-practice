/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/07/21, 9:28 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.singleton;

/*
* After first time, if we try to instantiate the Singleton class,
* the new variable also points to the first instance created. So whatever
* modifications we do to any variable inside the class through any instance,
* it affects the variable of the single instance created and is visible if we access
* that variable through any variable of that class type defined.
* */

public class Singleton {
//    create a single_instance static variable of type class
    private static Singleton single_instance = null;

//    variable of type string
    public String s;

//    private constructor restricted to this class itself
    private Singleton(){
        s = "Hello I am a string part of singleton class.";
    }

//    static method to create instance of singleton class
    public static Singleton getInstance(){
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

//driver class
class Main{
    public static void main(String[] args) {
//        instantiating singleton class with variable x
        Singleton x = Singleton.getInstance();

//        instantiating singleton class with variable y
        Singleton y = Singleton.getInstance();

//        instantiating singleton class with variable z
        Singleton z = Singleton.getInstance();

//        changing variable of instance type x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is: "+x.s);
        System.out.println("String from y is: "+y.s);
        System.out.println("String from z is: "+z.s);
        System.out.println("\n");

//        changing variable of instance z
        z.s = (z.s).toLowerCase();
        System.out.println("String from x is: "+x.s);
        System.out.println("String from y is: "+y.s);
        System.out.println("String from z is: "+z.s);
        System.out.println("\n");
    }
}