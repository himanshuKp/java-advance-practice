/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 03/03/21, 2:32 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(11));
    }
}
