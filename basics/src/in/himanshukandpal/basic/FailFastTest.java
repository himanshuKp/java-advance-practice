/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 27/06/21, 4:58 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastTest {
    public static void main(String[] args) {
        Map<String, String> cityCode = new ConcurrentHashMap<String, String>();
        cityCode.put("DL", "Delhi");
        cityCode.put("MB", "Mumbai");

        Iterator iterator = cityCode.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));
            cityCode.put("UP", "Uttar Pradesh");
        }
    }
}
