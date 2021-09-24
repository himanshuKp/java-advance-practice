/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/09/21, 1:52 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {
    List<String> items;
    String[] emptyStringArray = new String[0];

//    returning an empty array from a collection
    public String[] getItemsAsArray(){
        return items.toArray(emptyStringArray);
    }

//    returning a copy of collection
    public List<String> getItems() {
        if (items.isEmpty()) {
            return Collections.emptyList();
        } else    {
            return new ArrayList<String>(items);
        }
    }

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add(1,"One");
        nameList.add(2,"Two");
        for(String no:nameList){
            System.out.println(no);
        }
    }

}
