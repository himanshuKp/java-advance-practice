/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 4:03 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package set;

import java.util.Comparator;

public class StringBufferCompatator implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}
