/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 27/06/21, 5:23 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            if (itr.next() == 2){
                itr.remove();
            }
        }

        System.out.println(list);

        itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 3){
                list.remove(3);
            }
        }

        System.out.println(list);
    }
}
