/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/02/21, 1:53 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String str = "You are the creator of your own destiny";
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
