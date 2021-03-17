/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 17/03/21, 9:47 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.hashCodeMethod;

import java.util.AbstractMap;
import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println("Initial mapping are: "+map);

        System.out.println("THe hashcode value of map: "+map.hashCode());

        AbstractMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        System.out.println("THe hashcode value of map: "+map1.hashCode());

        System.out.println("Get default value if not found: "+map1.getOrDefault(3, "Nothing there"));
    }
}
