/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 04/04/21, 10:38 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.locale;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat defaultDateFormat = DateFormat.getDateInstance(0, Locale.getDefault());
        DateFormat usDateFormat = DateFormat.getDateInstance(0, Locale.US);

        System.out.println("Default date format: "+defaultDateFormat.format(date));
        System.out.println("US date format: "+usDateFormat.format(date));

        DateFormat timeInstance = DateFormat.getDateTimeInstance();
        System.out.println(timeInstance.format(date));

        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0,0);
        System.out.println(dateTimeInstance.format(date));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M/yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
