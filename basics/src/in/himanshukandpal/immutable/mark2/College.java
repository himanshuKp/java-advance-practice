/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/07/21, 2:28 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.immutable.mark2;

import java.util.HashMap;
import java.util.Map;

public class College {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        Student s = new Student("ABC", 190, map);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetaData());

        map.put("3", "third");
        System.out.println("\n"+s.getMetaData());
    }
}
