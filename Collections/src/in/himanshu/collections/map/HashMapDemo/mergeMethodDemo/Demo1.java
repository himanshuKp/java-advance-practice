/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 16/03/21, 3:14 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.mergeMethodDemo;

import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
//        create a hashmap and add some values
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "I");
        map2.put(2, "J");
        map2.put(3, "K");

        System.out.println("Map1: "+map1.toString());
        System.out.println("Map2: "+map2.toString());

        map2.forEach((key, value)->map1.merge(key, value, (v1, v2)->v1.equalsIgnoreCase(v2)?v1:v1+", "+v2));

        System.out.println("New HashMap: "+map1);
    }
}
