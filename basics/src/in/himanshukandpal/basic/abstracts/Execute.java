/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 21/09/21, 1:26 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.abstracts;

abstract class Branch {
    public abstract boolean validatePhotoProof(String proof);
    public abstract boolean validateAddressProof(String proof);
    public void openBankAccount(String photoProof, String addressProof, int amount){
        if (amount >= 1000){
            if (validatePhotoProof(photoProof)&&validateAddressProof(addressProof)){
                System.out.println("Account opened");
            }else {
                System.out.println("Account not opened");
            }
        }else {
            System.out.println("Account not opened");
        }
    }
}

class MumbaiBranch extends Branch{
    @Override
    public boolean validatePhotoProof(String proof) {
        if (proof.equalsIgnoreCase("adhaar card")){
            return true;
        }
        return false;
    }

    @Override
    public boolean validateAddressProof(String proof) {
        if (proof.equalsIgnoreCase("pan card")){
            return true;
        }
        return false;
    }
}

public class Execute {
    public static void main(String[] args) {
        Branch mumbaiBranch = new MumbaiBranch();
        mumbaiBranch.openBankAccount("adhaar card","pan card", 1000);
    }
}
