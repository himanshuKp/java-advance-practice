/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/06/21, 9:50 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCopy1 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

//        print hashset elements one by one
//        insertion order is not preserved and it is based
//        on hash code of objects

//        create iterator object
        Iterator itr = hashSet.iterator();

//        check element is present or not
//        if not loop will break;
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
