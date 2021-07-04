/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 04/07/21, 7:25 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.objectmapping;

import java.util.ArrayList;
import java.util.List;

//student class
class Student {
    String name;
    int id;
    String dept;

    public Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}

/*
* Department contains list of students
* object. It is associated with student
* class through its objects.
* */
class Department {
    String name;
    private List<Student> students;

    public Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}

/*
* Institute class contains list of department
* objects. It is associated with department
* class through its objects.
* */
class Institute {
    String instituteName;
    private List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

//    count total students of all departments
//    in a given institute
    public int getTotalStudentsInInstitute(){
        int noOfStudents = 0;
        List<Student> students;
        for (Department department: departments){
            students = department.getStudents();
            for (Student s: students){
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 3, "EE");
        Student s4 = new Student("Rahul", 4, "EE");

        /*making a list of CSE students*/
        List<Student> cseStudents = new ArrayList<>();
        cseStudents.add(s1);
        cseStudents.add(s2);

//        making a list of ee students
        List<Student> ee_students = new ArrayList<>();
        ee_students.add(s3);
        ee_students.add(s4);

        Department CSE = new Department("CSE", cseStudents);
        Department EE = new Department("EE", ee_students);

        List<Department> departments = new ArrayList<>();
        departments.add(CSE);
        departments.add(EE);

//        creating an instance of institute
        Institute institute = new Institute("BITS", departments);

        System.out.print("Total students in institute: ");
        System.out.println(institute.getTotalStudentsInInstitute());
    }
}
