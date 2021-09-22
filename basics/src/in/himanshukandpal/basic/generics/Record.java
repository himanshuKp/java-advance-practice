/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/09/21, 1:02 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.generics;

public class Record<E> {
    public E record;
    public void display(E item){
        System.out.println(item);
    }
}
