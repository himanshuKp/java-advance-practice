/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/09/21, 4:08 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.interfaces;

public abstract class Office implements IBank{
    @Override
    public void withdraw() {
        System.out.println("Account withdrawal");
    }
}
