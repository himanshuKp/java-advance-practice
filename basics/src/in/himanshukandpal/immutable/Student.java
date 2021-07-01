/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/07/21, 2:34 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.immutable;

import java.util.HashMap;
import java.util.Map;

public final class Student {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    public Student(String name, int regNo, Map<String, String> metadata) {
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry: metadata.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry: this.metadata.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}

class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "First");
        map.put("2", "Second");
        Student s = new Student("ABC", 2, map);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());

        map.put("3", "Third");
        System.out.println(s.getMetadata());    //remains unchanged due to deep copy in constructor

        s.getMetadata().put("4", "Four");
        System.out.println(s.getMetadata());    //remains unchanged due to deep copy in getter
    }
}
