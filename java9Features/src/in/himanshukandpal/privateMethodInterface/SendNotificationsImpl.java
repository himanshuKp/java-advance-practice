/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 13/04/21, 5:03 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.privateMethodInterface;

public class SendNotificationsImpl implements SendNotifications{
    public static void main(String[] args) {
        SendNotifications notifications = new SendNotificationsImpl();
        notifications.sendNotificatIon();
        notifications.sendNotifications();
    }
}
