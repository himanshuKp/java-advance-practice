package in.himanshu.collections;

import in.himanshu.collections.reversecomparator.ReverseComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("X");
        stringList.add("B");
        stringList.add("Z");

        System.out.println("Before sorting: "+stringList);

        Collections.sort(stringList);
//        Collections.sort(stringList, new ReverseComparator());

//        System.out.println("After sorting: "+stringList);

//        int findIndex = Collections.binarySearch(stringList, "C");
//        System.out.println(findIndex);

//        reverse list
        Collections.reverse(stringList);
        System.out.println("Reversing list: "+stringList);
    }
}
