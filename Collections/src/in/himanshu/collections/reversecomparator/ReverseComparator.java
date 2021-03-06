package in.himanshu.collections.reversecomparator;

import java.util.Comparator;

public class ReverseComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
