/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/07/21, 5:00 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("himanshu");
        stringArrayList.add("kandpal");
        stringArrayList.add("india");
        stringArrayList.add("coursera");

        LinkedList<String> newStringList = new LinkedList<>(stringArrayList);

        System.out.println(list);

//        add null into list
        list.add(null);
//        linked list accepts null
        System.out.println(list);

//        there can be more than one null in linkedlist
        list.add(null);
        System.out.println(list);

//        add element at a particular index
        list.add(2, "e");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println("Last element: "+list.removeLast());

        System.out.println("String linked list: "+newStringList);
    }
}
