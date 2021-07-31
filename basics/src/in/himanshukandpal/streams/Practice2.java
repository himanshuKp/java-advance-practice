/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 31/07/21, 8:56 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(5);
        l1.add(10);
        l1.add(15);
        l1.add(20);
        l1.add(25);
        l1.add(30);

        List<Integer> l2 = l1.stream().filter(element -> element%2==0).collect(Collectors.toList());
        System.out.println(l2);
    }
}
