/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 27/09/21, 10:34 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.innerclass;

interface Grade1 {
    char grades = 'A';
    public char calculateGrade(String employeeId, int point);
}

class Manager1 {
    Grade1 grade1 = new Grade1() {
        private char grade;
        @Override
        public char calculateGrade(String employeeId, int point) {
            if (point  < 100 && point >= 90) {
                grade = 'A';
            } else if (point < 90 && point >= 80) {
                grade = 'B';
            } else {
                grade = 'C';
            }
            return grade;
        }
    };
    public char checkEmployeeID(String employeeId, int point){
        return grade1.calculateGrade(employeeId, point);
    }
}

public class Execute1 {
    public static void main(String[] args) {
        Manager1 manager1 = new Manager1();
        String employeeId = "10001";
        char gradePoint = manager1.checkEmployeeID(employeeId, 89);
        System.out.println("The grade for "+employeeId+" is "+gradePoint);
    }
}
