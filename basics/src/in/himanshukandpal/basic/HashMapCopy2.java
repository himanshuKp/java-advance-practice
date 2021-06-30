/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 30/06/21, 9:25 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.HashMap;
import java.util.Map;

public class HashMapCopy2 {
    public static void main(String[] args) {
        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 3);
        original.put("D", 4);

        Map<String, Integer> secondMap = copyMap(original);

        System.out.println("Second copy map: "+secondMap);
    }

    private static Map<String, Integer> copyMap(Map<String, Integer> original) {
        Map<String, Integer> secondCopy = new HashMap<>();
        secondCopy.putAll(original);
        return secondCopy;
    }
}
