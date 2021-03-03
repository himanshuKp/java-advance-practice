/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 4:35 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package set.objectcomparable;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        int id1 = this.id;
        int id2 = o.id;

        if(id1 < id2){
            return -1;
        } else if(id1>id2){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
