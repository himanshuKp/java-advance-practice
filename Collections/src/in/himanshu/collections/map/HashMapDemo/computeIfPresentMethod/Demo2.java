/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 5:31 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */
//When key is absent or null
package in.himanshu.collections.map.HashMapDemo.computeIfPresentMethod;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Himanshu", 1);
        map.put("Kandpal", 2);
        map.put("Akshay", 3);

        System.out.println("Original map: "+map);

//        provide new value for key which is not present
        map.computeIfPresent("Sharma", (s, integer) -> integer+19000);

        System.out.println("Modified map when both are valid: "+map);

//        when key is null
        map.computeIfPresent(null, (s, integer) -> 10000);

        System.out.println("Modified map when key is null: "+map);

//        when both are null
        map.computeIfPresent(null, (s, integer) -> null);

        System.out.println("Modified map when both are null: "+map);

//        when value is null
        map.computeIfPresent("Akshay", (s, integer) -> null);

        System.out.println("Modified map when value is null: "+map);
    }
}
