/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 22/09/21, 10:28 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        String fullname = "Sachin";
        String lastname = "Tendulkar";
        StringBuffer sb = new StringBuffer(fullname);
        String fName = sb.append(lastname).toString();
        System.out.println(fName);
    }
}
