/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/05/21, 1:56 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.coupling;

public class ShoppingCartEntry {
    float price;
    int quantity;

    public float getTotalPrice() {
        return price*quantity;
    }
}
