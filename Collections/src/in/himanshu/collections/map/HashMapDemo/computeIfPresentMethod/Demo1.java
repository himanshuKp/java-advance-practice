/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 5:28 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */
//When key is present in hashmap
package in.himanshu.collections.map.HashMapDemo.computeIfPresentMethod;

import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Himanshu", 1);
        map.put("Kandpal", 2);
        map.put("Akshay", 3);

        System.out.println("Original map: "+map);

//        provide new value for key which is present
        map.computeIfPresent("Kandpal", (s, integer) -> integer+2000);

        System.out.println("Modified map: "+map);
    }
}
