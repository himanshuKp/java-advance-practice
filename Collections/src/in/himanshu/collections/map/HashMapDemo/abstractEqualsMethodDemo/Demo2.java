/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 16/03/21, 5:31 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.abstractEqualsMethodDemo;

import java.util.AbstractMap;
import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        AbstractMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        AbstractMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");

        System.out.println("Equality: "+map1.equals(map2));
    }
}
