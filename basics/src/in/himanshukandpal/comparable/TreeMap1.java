/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 11/08/21, 8:40 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.comparable;

import java.util.Map;
import java.util.TreeMap;

class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        int diff = this.id - o.id;
        return diff;
    }
}

public class TreeMap1 {
    public static void main(String[] args) {
//        Declaring and initializing a treemap
        TreeMap<Employee, String> tm = new TreeMap<>();
//        TreeMap<String, String> tm = new TreeMap<>();

        Employee e1 = new Employee(1, "Himanshu");
        Employee e2 = new Employee(2, "Pratibha");

        tm.put(e1, "First");
        tm.put(e2, "Second");

//        tm.put("1", "First");
//        tm.put("2", "Second");

//        Map with employee key
        for (Map.Entry<Employee, String> e: tm.entrySet()){
            System.out.println(e.getKey().id+" "+e.getValue());
        }

//        for (Map.Entry<String, String> e: tm.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
    }
}
