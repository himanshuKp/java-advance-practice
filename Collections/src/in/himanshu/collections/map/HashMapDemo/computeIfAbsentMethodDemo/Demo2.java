/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 12/03/21, 5:20 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.computeIfAbsentMethodDemo;

import java.util.HashMap;

public class Demo2{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Aman");
        map.put(20, "Preet");
        map.put(30, "Harpreet");

        System.out.println("Original map: "+map);

        map.computeIfAbsent(40, k->"Himanshu");
        map.computeIfAbsent(20, k->"Sujeet");

        System.out.println("New map: "+map);

    }
}
