/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 2:13 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> tempLinkList = new LinkedList<>();
        List<Integer> tempArrayList = new ArrayList<>();
        long startLink = System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            tempLinkList.add(i);
        }
        long endLink = System.currentTimeMillis();

        long startArray = System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            tempLinkList.add(i);
        }
        long endArray = System.currentTimeMillis();
        System.out.println("Total time linkedlist: "+(endLink- startLink));
        System.out.println("Total time arraylist: "+(endArray - startArray));
    }

}
