/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/07/21, 3:34 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.lambda;

public class TypeInterfaceExample {
    public static void main(String[] args) {
        StringLength length = s -> s.length();
        System.out.println(length.getLength("Hello World"));

        getStringLength(s->s.length());
    }

    public static void getStringLength(StringLength string){
        System.out.println(string.getLength("Good Night"));
    }

    interface StringLength {
        int getLength(String s);
    }
}
