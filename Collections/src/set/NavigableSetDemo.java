/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 05/03/21, 5:12 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package set;

import java.util.*;

public class NavigableSetDemo {
    public static void main(String[] args) {
//        navigable set is an interface, cannot instantiate its method directly
        NavigableSet<Integer> navigableSet = new TreeSet<Integer>();

        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);

        System.out.println("Navigable set: "+navigableSet);

//        lowest element in the set, greater then or equal to passing element
        System.out.println("Ceiling element (ceiling()): "+navigableSet.ceiling(20));

//        lowest element in the set, greater then the passing element
        System.out.println("Higher element then passing (higher()): "+navigableSet.higher(20));

//        greatest element in the set, lesser then or equal to passing element, null if no such element
        System.out.println("Floor floor(): "+navigableSet.floor(20));

//        greatest element in the set, strictly lower then passing, null if no such element
        System.out.println("Lower lower(): "+navigableSet.lower(20));

        System.out.println("Navigable set: "+navigableSet);

//        retrieves and removes the first lowest element, null if set is empty
        System.out.println("Poll first - pollFirst(): "+navigableSet.pollFirst());

        System.out.println("Navigable set: "+navigableSet);

//      retrieves and removes the last highest element, null if the set is empty
        System.out.println("Poll last - pollLast(): "+navigableSet.pollLast());

        System.out.println("Navigable set: "+navigableSet);

        System.out.println("Descending set: "+navigableSet.descendingSet());
    }
}
