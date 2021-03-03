/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 2:46 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Random obj = new Random();

        Set<Integer> integerTreeSet = new TreeSet<>();
        for (int i=0;i<5;i++){
            int element = obj.nextInt(100);
            integerTreeSet.add(element);
        }

//        Integer hash set
        Set<Integer> integerHashSet = new HashSet<>();
        for (int i=0;i<5;i++){
            int element = obj.nextInt(100);
            integerHashSet.add(element);
        }

//        String tree set
        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("abc");
        stringTreeSet.add("xyz");
        stringTreeSet.add("def");

        System.out.println("Integer tree set: "+integerTreeSet);
        System.out.println("Integer hash set: "+integerHashSet);
        System.out.println("String tree set: "+stringTreeSet);

        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("def");
        list.add("fed");

        List<Integer> listInteger = new LinkedList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

//        traverse set in forward direction
//        list iterator does not work on set
//        ListIterator<String> ltr = stringTreeSet.iterator();

//        ListIterator<String> itr = (ListIterator<String>) list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        while (itr.hasPrevious()){
//            System.out.println(itr.previous());
//        }
//
//        ListIterator<Integer> itrInteger = (ListIterator<Integer>) listInteger.iterator();
//        while (itrInteger.hasNext()){
//            System.out.println(itrInteger.next());
//        }
//        while (itrInteger.hasPrevious()){
//            System.out.println(itrInteger.previous());
//        }

        Set<StringBuffer> stringBufferSet = new TreeSet<>(new StringBufferCompatator());
        stringBufferSet.add(new StringBuffer("abc"));
        stringBufferSet.add(new StringBuffer("fds"));
        stringBufferSet.add(new StringBuffer("def"));

        System.out.println("String buffer set: "+stringBufferSet);

    }
}
