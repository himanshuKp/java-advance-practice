/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 17/03/21, 10:41 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshu.collections.map.HashMapDemo.hashCodeMethod;

public class Demo2 {
    public static void main(String[] args) {
        Key key = new Key("AB");
        System.out.println("Key hashCode: "+key.hashCode());

        Key key1 = new Key("BA");
        System.out.println("Key1 hashcode: "+key1.hashCode());
    }
}
