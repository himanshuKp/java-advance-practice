/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/06/21, 4:00 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.puzzels;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class FirstAmongEquals {
    public static void main(String[] args) {
        String[] declaration = {"I", "Came", "I", "Saw", "I", "Left"};
        Map<String, Integer> firstIndex = new HashMap<>();
        for (int i = declaration.length - 1; i >= 0 ; i--) {
            firstIndex.put(declaration[i], i);
        }
        int inMap = 0;
        for (String word: declaration){
            if (firstIndex.containsKey(word)){
                inMap++;
            }
        }
        System.out.println(inMap);
    }
}
