/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/03/21, 4:30 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.jvm;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("himanshukandpal");
        Class c1 = u1.getClass();

        User u2 = new User("pratibha");
        Class c2 = u2.getClass();

        System.out.println("Class 1: "+c1.hashCode());
        System.out.println("CLass 2: "+c2.hashCode());

        System.out.println("Are both same: "+(c1 == c2));
//        loaded by appclassloader
        System.out.println("CLass 1 loader: "+c1.getClassLoader());
//        loaded by bootstrap class loader of jre, native to platform
        System.out.println("String class loader: "+String.class.getClassLoader());
    }
}
