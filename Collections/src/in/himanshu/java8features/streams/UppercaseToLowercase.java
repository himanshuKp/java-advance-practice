/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 10/03/21, 11:15 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("HIMANSHU");
        l1.add("SANTOSH");

        System.out.println(l1);

        List<String> l2 = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(l2);

        String name = "HIMANSHU";
    }
}
