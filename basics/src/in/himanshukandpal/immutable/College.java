/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/07/21, 2:47 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.immutable;

import java.util.HashMap;
import java.util.Map;

public final class College {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    public College(String name, int regNo, Map<String, String> metadata) {
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
        Map<String, String> temp = new HashMap<>();
        for (Map.Entry<String, String> entry: this.metadata.entrySet()){
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }
}
class TestImmutable {
    public static void main(String[] args) {
        Map<String, String> entryMap = new HashMap<>();
        entryMap.put("1", "First");
        entryMap.put("2", "Second");
        entryMap.put("3", "Third");
        College college = new College("Stanford", 1234, entryMap);
        System.out.println(college.getName());
        System.out.println(college.getRegNo());
        System.out.println(college.getMetadata());

        entryMap.put("4", "Four");
        System.out.println(college.getMetadata());  //remain unchanged due to deep copy in constructor

        college.getMetadata().put("5", "Five");
        System.out.println(college.getMetadata());  //remain unchanged due to deep copy in getter
    }
}
