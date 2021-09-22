/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/09/21, 1:04 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.generics;

public class GenericDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Robert");
        Record<Integer> record1 = new Record<>();
        record1.display(2);
        Record<Student> studentRecord = new Record<>();
        studentRecord.display(s1);
    }
}
