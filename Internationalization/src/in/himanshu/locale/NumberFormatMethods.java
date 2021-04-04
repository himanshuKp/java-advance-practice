/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/04/21, 11:16 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.locale;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatMethods {
    public static void main(String[] args) {
        Double d = 1234567.2344;
        Long l = 12356789l;
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(nf.format(l));
    }
}
