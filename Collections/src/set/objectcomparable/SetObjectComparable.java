/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 4:38 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package set.objectcomparable;

import java.util.Set;
import java.util.TreeSet;

public class SetObjectComparable {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(new Employee(1,"himanshu"));
        employeeSet.add(new Employee(4, "ravi"));
        employeeSet.add(new Employee(2,"deepti"));

        System.out.println(employeeSet);
    }
}
