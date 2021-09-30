/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 27/09/21, 10:01 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.innerclass;

class Manager {                                                // Outer Class
    private class Grade {                                        // Inner Class
        private char grade;
        private char calculateGrade(String employeeId, int point) {
            if (isEmployeeExists(employeeId))  {
                if (point  < 100 && point >= 90) {
                    grade = 'A';
                } else if (point < 90 && point >= 80) {
                    grade = 'B';
                } else {
                    grade = 'C';
                }
            }
            return grade;
        }
        // Check if the employee id exists or not
        private boolean isEmployeeExists(String employeeId) {
            // check from database or file system
            return true;
        }
    }
    public char checkEmployeeID(String employeeId, int point) {
        Grade grade = new Grade();
        return grade.calculateGrade(employeeId,point);
    }
}
public class Execute {
    public static void main (String[] args) {
        Manager manager = new Manager();
        String employeeId = "I1001";
        char gradePoint = manager.checkEmployeeID(employeeId, 80);
        System.out.println("the grade for" + employeeId + "is" + gradePoint);
    }
}
