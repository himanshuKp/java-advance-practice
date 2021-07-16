/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 16/07/21, 2:36 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(0);
        i.add(5);
        i.add(10);
        i.add(15);
        i.add(20);
        i.add(25);
        i.add(30);

        System.out.println(i);
        List<Integer> l2 = i.stream().filter(element -> element%2==0).collect(Collectors.toList());
        System.out.println(l2);
    }
}
