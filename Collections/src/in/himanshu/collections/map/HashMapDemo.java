/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 11:44 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

//        add elements to the amp
        map.put("vishal", 10);
        map.put("sachin", 20);
        map.put("vaibhav", 30);

//        print size and content
        System.out.println("Size of map is: "+map.size());

//        check if a key is present and print value
        if (map.containsKey("vishal")){
            Integer value = map.get("vishal");
            System.out.println("Value for key vishal is: "+value);
        }

//        Synchronized map
        Map<Integer, String> synchMap1 = Collections.synchronizedMap(new HashMap<>());
        synchMap1.put(1,"Himanshu");
        synchMap1.put(2, "Santosh");

        System.out.println(synchMap1);
    }
}
