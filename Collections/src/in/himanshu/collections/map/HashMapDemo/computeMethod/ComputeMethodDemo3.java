/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 5:00 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

//TO SHOW NullPointerException

package in.himanshu.collections.map.HashMapDemo.computeMethod;

import java.util.HashMap;
import java.util.Map;

public class ComputeMethodDemo3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 12);
        map.put("key2", 13);

        System.out.println(map);

        try{
//            remap the value using compute() method
//            passing null value will throw exception
            map.compute(null, (key, val)->val+3);
            System.out.println("New Map: "+map);
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}
