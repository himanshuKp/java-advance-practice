/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/09/21, 5:11 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>();
        companies.add("IBM");
        companies.add("Google");
        companies.add("Infosys");
        companies.add("Zee");
        companies.add("Apple");

        System.out.println(Collections.min(companies));
        Collections.shuffle(companies);
//        System.out.println(companies);

    }
}
