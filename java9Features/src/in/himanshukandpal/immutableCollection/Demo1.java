/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/04/21, 3:01 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.immutableCollection;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("check");
        List<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("xyz");
        demo1.print(list,list1);
    }

    @SafeVarargs
    private void print(List... topics) {
        for (List<String> topic:topics) {
            System.out.println(topic);
        }
    }
}
