/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 26/05/21, 1:59 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.coupling;

public class Order {
    private CartContents cart;
    private float salesTax;

    public Order(CartContents cart, float salesTax) {
        this.cart = cart;
        this.salesTax = salesTax;
    }

    public float totalPrice(){
        return cart.getTotalPrice()*(1.0f + salesTax);
    }
}
