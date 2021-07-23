/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/07/21, 2:09 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.immutable.mark2;

import java.util.HashMap;
import java.util.Map;

public final class Student {
    private final String name;
    private final int regNo;
    private final Map<String, String> metaData;

    public Student(String name, int regNo, Map<String, String> metaData) {
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry:metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metaData = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetaData() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry: this.metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
