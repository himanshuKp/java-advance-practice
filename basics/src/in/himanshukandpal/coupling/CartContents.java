/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/05/21, 1:57 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.coupling;

public class CartContents {
    ShoppingCartEntry[] items;

    public float getTotalPrice(){
        float totalPrice = 0;
        for (ShoppingCartEntry item: items){
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
