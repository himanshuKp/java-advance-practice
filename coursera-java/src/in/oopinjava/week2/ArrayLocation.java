/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 13/07/21, 4:40 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.oopinjava.week2;

import java.util.Arrays;

public class ArrayLocation {
    private double[] coord;

    public ArrayLocation(double[] coord) {
        this.coord = coord;
    }

    public static void main(String[] args) {
        double[] coords = {5.0, 0.0};
        ArrayLocation accra = new ArrayLocation(coords);
        coords[0] = 32.9;
        coords[1] = -117.2;
        System.out.println(accra);
    }

    @Override
    public String toString() {
        return "ArrayLocation{" +
                "coord=" + Arrays.toString(coord) +
                '}';
    }
}
