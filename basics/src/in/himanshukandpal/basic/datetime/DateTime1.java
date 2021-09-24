/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 23/09/21, 5:08 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.datetime;

import java.time.*;

public class DateTime1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("today: "+date);
        System.out.println("yesterday: "+yesterday);
        System.out.println("tomorrow: "+tomorrow);

        LocalTime time = LocalTime.now();
        System.out.println("Time: "+time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date time: "+dateTime);

        System.out.println("Zoned date time: "+ ZonedDateTime.now());

        Period period = Period.of(1, 5, 2001);
        System.out.println(period.getDays()+" : "+period.getMonths());
    }
}
