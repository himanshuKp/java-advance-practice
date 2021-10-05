/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/10/21, 2:57 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.java8.staticmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> countryList = Arrays.asList("India", "America", "Japan", "Brazil");
        countryList.sort(Comparator.naturalOrder());
        for (String country: countryList){
            System.out.println(country);
        }
    }
}
