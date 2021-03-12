/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 4:45 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.computeMethod;

import java.util.HashMap;

public class ComputeMethodDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 12);
        map.put("key2", 13);

//        print original map
        System.out.println(map);

//        remap the values using compute method
        map.compute("key1", (key, val)-> (val == null)?1:val+1);
        map.compute("key2", (key, val)-> (val == null)?1:val+2);

//        print the remapped
        System.out.println(map);
    }

}
