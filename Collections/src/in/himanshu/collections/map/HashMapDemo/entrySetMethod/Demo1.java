/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 5:50 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.entrySetMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<Integer, String>  map = new HashMap<>();
        map.put(10, "Himanshu");
        map.put(20, "Kandpal");
        map.put(30, "Ankit");
        map.put(40, "Sharma");

        System.out.println("Map: "+map);

        Set<Map.Entry<Integer, String>> set = map.entrySet();

        System.out.println("Corresponding set: "+set);
    }
}
