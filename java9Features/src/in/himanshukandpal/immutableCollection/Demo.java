/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/04/21, 2:46 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.immutableCollection;

import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        List<String> list = List.of("abc","xyz","abc");
        Set<String> set = Set.of("abc","xyz");
        System.out.println(list);
        System.out.println(set);

    }
}
