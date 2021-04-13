/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 13/04/21, 5:01 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.privateMethodInterface;

public interface SendNotifications {
    default void sendNotifications(){
        establishConnection();
        System.out.println("Sending multiple notifications.");
    }
    default void sendNotificatIon(){
        establishConnection();
        System.out.println("Sending notification.");
    }
    private void establishConnection(){
        System.out.println("Establishing connection");
    }
}
