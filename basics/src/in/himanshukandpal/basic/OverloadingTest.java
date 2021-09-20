/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 6:04 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

public class OverloadingTest {

    public void display(Object ref){
        System.out.println("Object..."+ref);
    }
    public void display(String ref){
        System.out.println("String..."+ref);
    }

    public static void main(String[] args) {
        OverloadingTest test = new OverloadingTest();
        test.display(null);
    }
}
