/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/06/21, 10:02 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

//        last element
        int ele = 0;

        for (int i: set){
            ele = i;
        }

//        print the linkedhashset
        System.out.println("LinkedHashSet: "+set);

//        last element
        System.out.println("Last element: "+ele);
    }
}
