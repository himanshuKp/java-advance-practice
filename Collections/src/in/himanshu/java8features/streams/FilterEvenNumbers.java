/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 10/03/21, 11:05 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            li.add(i);
        }
        System.out.println(li);

//        one way to find even number
//        List<Integer> li2 = new ArrayList<>();
//        for (Integer i : li) {
//            if(i%2==0){
//                li2.add(i);
//            }
//        }
//      another way to find even numbers
        List<Integer> l2 = li.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.println(l2);

    }
}
