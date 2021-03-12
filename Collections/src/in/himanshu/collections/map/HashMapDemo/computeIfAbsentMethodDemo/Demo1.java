/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 5:15 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.computeIfAbsentMethodDemo;

import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 10000);
        map.put("key2", 20000);
        map.put("key3", 30000);

//        print original map
        System.out.println(map);

//        provide value for new key which is absent
        map.computeIfAbsent("key4", k->40000);
//        provide value for key which is present
        map.computeIfAbsent("key3", k->50000);

        System.out.println(map);

    }
}
