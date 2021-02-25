/*
 * Copyright (c) 2021.
 * Name: Himanshu Kandpal
 * Git: https://github.com/himanshuKp
 * Email: hk@himanshukandpal.in
 */

package com.himanshu.anonymousinner;

public class DriverManager {
    static Connection getConnection(){
        Connection con = new Connection() {
            @Override
            public void createStatement() {
                System.out.println("Anonymous inner class");
            }
        };
        return con;
    }
}
