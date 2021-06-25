/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 25/06/21, 9:46 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic;

interface Animals {
    void animalSound();
    default void beforeSleep(){
        sleep();
    }
    private void sleep(){
        System.out.println("Zzz..");
    }
}

class Dogs implements Animals {
    @Override
    public void animalSound() {
        System.out.println("The dog says: woo woo.");
    }
}

public class InterfaceClassTest {
    public static void main(String[] args) {
        Animals dog = new Dogs();
        dog.animalSound();
        dog.beforeSleep();

    }
}
