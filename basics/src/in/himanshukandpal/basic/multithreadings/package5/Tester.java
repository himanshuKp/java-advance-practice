/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 29/09/21, 8:09 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.multithreadings.package5;

import java.util.Calendar;

class Course {
    public String courseName;
    public int numOfSeats;

    public Course(String courseName, int numOfSeats) {
        this.courseName = courseName;
        this.numOfSeats = numOfSeats;
    }

    public synchronized void registerForCourse(){
        try {
            if (this.numOfSeats - 1 < 0){
                this.wait(5000);
                if (this.numOfSeats - 1 < 0){
                    throw new Exception("No more registerations please.");
                }
            }
            this.numOfSeats -= 1;
            System.out.println("Booking successfull");
            System.out.println("Available seats: "+this.numOfSeats);
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public synchronized void cancelSeats(){
        try{
            this.numOfSeats += 1;
            System.out.println("Cancellation successfull");
            System.out.println("Available seats: "+this.numOfSeats);
            this.notify();
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

class RegisterThread extends Thread {
    Course c;

    RegisterThread(Course c){
        this.c = c;
    }

    @Override
    public void run() {
        c.registerForCourse();
    }
}

class CancellationThread extends Thread {
    Course c;

    CancellationThread(Course c){
        this.c = c;
    }

    @Override
    public void run() {
        c.cancelSeats();
    }
}

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        Course c = new Course("Java", 1);
        RegisterThread t1 = new RegisterThread(c);
        RegisterThread t2 = new RegisterThread(c);
        t1.start();
        t2.start();

        Thread.sleep(2000);
        CancellationThread cancellationThread = new CancellationThread(c);
        cancellationThread.start();
    }
}
