/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/06/21, 9:20 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.HashMap;
import java.util.Map;

public class HashMapCopy1 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 4);

        Map<String, Integer> secondMap = copyMap(hashMap);
        System.out.println(secondMap);
    }

    private static Map<String, Integer> copyMap(Map<String, Integer> hashMap) {
        Map<String, Integer> secondMap = new HashMap<>();

        for (Map.Entry<String, Integer> entrySet: hashMap.entrySet()){
            secondMap.put(entrySet.getKey(), entrySet.getValue());
        }

        return secondMap;
    }
}
