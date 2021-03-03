/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 4:11 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package comparator;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int length1 = o1.length();
        int length2 = o2.length();
        if(length1 < length2){
            return -1;
        } else if(length1 > length2){
            return 1;
        } else {
            return 0;
        }
    }
}
