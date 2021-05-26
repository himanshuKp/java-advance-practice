/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/05/21, 1:49 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class WrapperClasses {
    public static void main(String[] args) {
//        Integer value1 = new Integer(2);
//        Integer value2 = new Integer(2);
//        Integer value1 = 2;
//        Integer value2 = 2;
//        System.out.println(value1==value2);
//        System.out.println(value1.equals(value2));

//        Strings
//        String str1 = "value1";
//        str1.concat("value2");
//        System.out.println(str1);   //needs to tbe put into new value, else str1 will remain unmodified.
//        String concat = str1.concat("value2");
//        System.out.println(concat);

        String str1 = "testing";
        if (str1 instanceof String){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (str1 instanceof Object){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
