/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 3:43 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class Demo {
    int i;
    Demo(int i){
        System.out.println(i);
        this.i = i;
    }
    public static void main(String[] args){
        Demo obj = new Demo(10);
        System.out.println(obj.i);
    }
}
