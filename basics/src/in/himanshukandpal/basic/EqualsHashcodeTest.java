/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/06/21, 1:52 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualsHashcodeTest {
    public static void main(String[] args) {
//        EmployeeKey ek1 = new EmployeeKey("101", "10101011");
//        EmployeeKey ek2 = new EmployeeKey("101", "10101011");
//        EmployeeKey ek3 = new EmployeeKey("102", "10101011");
//        EmployeeKey ek4 = new EmployeeKey("103", "10101011");
//
//        Set<EmployeeKey> set = new HashSet<>();
//        set.add(ek1);
//        set.add(ek2);
//        set.add(ek3);
//        set.add(ek4);
//
//        System.out.println(set);

        Map<EmployeeKey, String> cache = loadEmpCache();
        EmployeeKey lookupKey = new EmployeeKey("101", "10101011");

        String employeeName = cache.get(lookupKey);
        System.out.println(employeeName);
    }

    static Map<EmployeeKey, String> loadEmpCache(){
        EmployeeKey ek1 = new EmployeeKey("101", "10101011");
        EmployeeKey ek2 = new EmployeeKey("102", "10101011");
        EmployeeKey ek3 = new EmployeeKey("103", "10101011");

        Map<EmployeeKey, String> cache = new HashMap<>();
        cache.put(ek1, "Himanshu");
        cache.put(ek2, "Kandpal");
        cache.put(ek3, "Pratibha");

        return cache;
    }
}

class EmployeeKey {
    String empId;
    String dob;

    public EmployeeKey(String empId, String dob) {
        this.empId = empId;
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeKey that = (EmployeeKey) o;

        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;
        return dob != null ? dob.equals(that.dob) : that.dob == null;
    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeKey{" +
                "empId='" + empId + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
