/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 05/03/21, 3:07 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package map;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("himanshu", 10);
        map.put("santosh", 30);
        map.put("pratibha", 20);
        map.put("prabhat", 40);


//        get all the keys, will received unordered
        Set<String> keys = map.keySet();
        System.out.println("Keys: "+keys);

//        get all the values of map
        Collection<Integer> values = map.values();
        System.out.println("Values: "+values);

//        get key value pairs based on keys
        for(String key: keys){
            System.out.println("Key:"+key+" Value:"+map.get(key));
        }
    }
}
