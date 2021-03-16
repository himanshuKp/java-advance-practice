/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 16/03/21, 3:23 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.mergeMethodDemo;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "J");
        map2.put(4, "K");
        map2.put(5, "L");

        System.out.println("Map1: "+map1.toString());
        System.out.println("Map2: "+map2.toString());

        map2.forEach(
                (key, value)->map1.merge(key, value, (v1, v2)->v1.equalsIgnoreCase(v2)?v1:v1+", "+v2)
        );

        System.out.println("New HashMap M1: "+map1.toString());
    }
}
