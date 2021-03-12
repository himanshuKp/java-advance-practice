/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 4:42 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.computeMethod;

import java.util.HashMap;

public class ComputeMethodDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Name", "Himanshu");
        map.put("Address", "Ghaziabad");

//        print this map
        System.out.println(map);

//        remap the values using compute() method
        map.compute("Name", (key, val)->val.concat(" Kandpal"));
        map.compute("Address", (key, val)->val.concat(", Uttar Pradesh"));

//        print new mapping
        System.out.println(map);
    }
}
