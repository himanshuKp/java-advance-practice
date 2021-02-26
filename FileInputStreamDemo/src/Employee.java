/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/02/21, 2:59 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

import java.io.Serializable;

public class Employee implements Serializable {

    int id;
    String name;
    double salary;
    transient int adhaar;

    public Employee(int id, String name, double salary, int adhaar) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.adhaar = adhaar;
    }
}
