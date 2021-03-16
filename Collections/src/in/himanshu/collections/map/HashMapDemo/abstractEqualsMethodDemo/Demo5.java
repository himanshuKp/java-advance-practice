/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 16/03/21, 5:35 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.abstractEqualsMethodDemo;

import java.util.AbstractMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Demo5 {
    public static void main(String[] args) {
        AbstractMap<Integer, String> map1 = new ConcurrentSkipListMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        AbstractMap<Integer, String> map2 = new ConcurrentSkipListMap<>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");

        System.out.println("Map 1: "+map1);
        System.out.println("Map 2: "+map2);

        System.out.println("Equality: "+map1.equals(map2));
    }
}
