/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 05/03/21, 3:07 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package map;

import java.util.*;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

//      IDENTITYHASHMAP uses == operator for comparison of keys (discard duplicate keys)

        Map<Integer, String> map = new IdentityHashMap<>();

        Integer key1 = new Integer(10);
        Integer key2 = new Integer(10);

        map.put(key1, "Himanshu");
        map.put(key2, "Pratibha");

        System.out.println("Identity hash map: "+map);
    }
}
