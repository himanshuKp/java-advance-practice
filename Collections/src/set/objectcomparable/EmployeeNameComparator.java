/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 4:59 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package set.objectcomparable;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        String s1 = o1.getName();
        String s2 = o2.getName();
        return s1.compareTo(s2);
    }
}
