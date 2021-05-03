/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 01/05/21, 6:27 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.hashmap;

public class HashMap {
    public String[] hashMap;

    public HashMap(int size) {
        this.hashMap = new String[size];
    }

    public static void main(String[] args) {
        HashMap newHashMap = new HashMap(3);
        newHashMap.assign("favoriteColor","blue");
        System.out.println(newHashMap.retrieve("favoriteColor"));
    }

    public int hash(String key){
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode += Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashMap.length;
        return hashCode;
    }

    public void assign(String key, String value){
        int arrayIndex = this.hash(key);
        this.hashMap[arrayIndex] = value;
    }

    public String retrieve(String key){
        int arrayIndex = this.hash(key);
        return this.hashMap[arrayIndex];
    }
}
