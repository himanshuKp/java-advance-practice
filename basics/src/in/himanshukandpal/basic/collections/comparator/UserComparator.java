/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/09/21, 7:09 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CourseComparator implements Comparator<Course>{
    @Override
    public int compare(Course o1, Course o2) {
        return o1.getCourseId() - o2.getCourseId();
    }
}

class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}

public class UserComparator {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1001, "Java"));
        courseList.add(new Course(500, "Angular"));
        courseList.add(new Course(100, "Java"));

        Collections.sort(courseList, new CourseComparator());
        System.out.println(courseList);
    }
}
