/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 16/03/21, 3:42 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.putMethodDemo;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");
        map1.put(5, "E");

        System.out.println("Initial mapping are: "+map1);

        String returnedValue = map1.put(6, "F");

        System.out.println("Returned value: "+returnedValue);

        System.out.println("New Mapping are: "+map1);
    }
}
