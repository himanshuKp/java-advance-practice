/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 24/09/21, 3:50 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.practices;
/*
* make immutable class
* all fields private
* constructor private
* use static factories to create object
* */
public class ProductTest1 {
    private String productCode;
    private String productName;

    private ProductTest1(String productCode, String productName) {
        this.productCode = productCode;
        this.productName = productName;
    }

    public static ProductTest1 valueOf(String productCode, String productName){
        return new ProductTest1(productCode, productName);
    }
}
