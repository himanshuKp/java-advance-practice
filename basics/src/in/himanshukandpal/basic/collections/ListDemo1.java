/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/09/21, 1:36 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}

public class ListDemo1 {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("Java"));
        courseList.add(new Course("Angular"));
        courseList.add(new Course("SQL/PL"));

        Iterator<Course> courseIterator = courseList.iterator();
        while (courseIterator.hasNext()){
            Course course = courseIterator.next();
            System.out.println(course);
        }
    }
}
