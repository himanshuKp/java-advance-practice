/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/06/21, 10:24 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.HashSet;
import java.util.Set;

public class HashSetCopy2 {
    public static void main(String[] args) {
//        create hashset object
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(null);

//        we don't know the hashcode, so we don't know order of insertion
        System.out.println(hashSet);
    }
}
