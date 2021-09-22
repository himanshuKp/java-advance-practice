/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 9:15 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.tryout;

public class Account {
    static int minBalance;

    static {
        minBalance = 1000;
    }
    static {
        System.out.println("Minimum balance account");
    }

    public static int getMinBalance(){
        return minBalance;
    }

    public static void main(String[] args) {
        System.out.println("Minimum balance: "+getMinBalance());
    }
}
