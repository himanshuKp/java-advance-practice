/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/09/21, 1:08 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Course1 {
    private String courseName;

    public Course1(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}

public class MapDemo1 {
    public static void main(String[] args) {
        Set<Course1> courseSet1 = new HashSet<>();
        courseSet1.add(new Course1("Java"));
        courseSet1.add(new Course1("AngularJS"));

        Set<Course1> courseSet2 = new HashSet<>();
        courseSet2.add(new Course1("PHP"));
        courseSet2.add(new Course1("HTML"));
        courseSet2.add(new Course1("CSS"));

        Map<Integer, Set<Course1>> studentCourses = new HashMap<>();
        studentCourses.put(1001, courseSet1);
        studentCourses.put(1002, courseSet2);

        Set<Course1> courseSet = studentCourses.get(1001);
        System.out.println("Retrieving the set of courses for student with id 1001 are:");
        System.out.println(courseSet);

        for (Set<Course1> courses: studentCourses.values()) {
            System.out.println(courses);
        }
    }
}
