/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 4:41 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

//        add elements to the amp
        map.put(10,"vishal");
        map.put(20,"sachin");
        map.put(30,"vaibhav");

//        print size and content
//        System.out.println("Size of map is: "+map.size());

//        check if a key is present and print value
//        if (map.containsKey("vishal")){
//            Integer value = map.get("vishal");
//
//
////        Synchronized map
//        Map<Integer, String> synchMap1 = Collections.synchronizedMap(new HashMap<>());
//        synchMap1.put(1,"Himanshu");
//        synchMap1.put(2, "Santosh");       System.out.println("Value for key vishal is: "+value);
//        }

//        System.out.println(synchMap1);

//        clear() method
//        System.out.println("Initial mapping are: "+map);
//        map.clear();
//        System.out.println("Finally the maps looks like: "+map);

//        clone() method
//        System.out.println("Original map: "+map.hashCode());
//        Object map2 = map.clone();
//        System.out.println("Cloned map: "+map2.hashCode());
//        System.out.println(map.containsKey(50));
    }
}
