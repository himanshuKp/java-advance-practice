/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 04/07/21, 7:40 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.objectmapping;

import java.util.ArrayList;
import java.util.List;

class Student2 {
    String name;
    int id;
    String department;

    public Student2(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
}

class Department2 {
    String name;
    private List<Student2> students2;

    public Department2(String name, List<Student2> students2) {
        this.name = name;
        this.students2 = students2;
    }

    public List<Student2> getStudents2() {
        return students2;
    }
}

class Institute2 {
    String instituteName;
    private List<Department2> departments2;

    public Institute2(String instituteName, List<Department2> departments2) {
        this.instituteName = instituteName;
        this.departments2 = departments2;
    }

    public int getTotalStudentsInTheInstitute(){
        int no_of_students = 0;
        List<Student2> students2;
        for (Department2 department2: departments2){
            students2 = department2.getStudents2();
            for (Student2 student: students2){
                no_of_students++;
            }
        }
        return no_of_students;
    }
}

public class Aggregation2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Mia", 1, "CSE");
        Student2 s2 = new Student2("Priya", 2, "CSE");
        Student2 s3 = new Student2("John", 3, "EE");
        Student2 s4 = new Student2("Rahul", 4, "EE");

        /*making a list of CSE students*/
        List<Student2> cseStudents = new ArrayList<>();
        cseStudents.add(s1);
        cseStudents.add(s2);

//        making a list of ee students
        List<Student2> ee_students = new ArrayList<>();
        ee_students.add(s3);
        ee_students.add(s4);

        Department2 CSE = new Department2("CSE", cseStudents);
        Department2 EE = new Department2("EE", ee_students);

        List<Department2> departments = new ArrayList<>();
        departments.add(CSE);
        departments.add(EE);

//        creating an instance of institute
        Institute2 institute = new Institute2("BITS", departments);

        System.out.print("Total students in institute: ");
        System.out.println(institute.getTotalStudentsInTheInstitute());
    }
}
