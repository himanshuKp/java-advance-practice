/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 20/09/21, 6:41 PM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.basic.exercises;

import java.util.Arrays;

public class Registration {
    private String customerName;
    private String panCardNo;
    private int voterId;
    private String passportNo;
    private int licenceNo;
    private long[] telephoneNo;

    public Registration(String customerName, String passportNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
    }

    public Registration(String customerName, int licenceNo, String panCardNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.licenceNo = licenceNo;
        this.telephoneNo = telephoneNo;
    }

    public Registration(String customerName, int voterId, int licenceNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenceNo = licenceNo;
        this.telephoneNo = telephoneNo;
    }

    public Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo){
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    public long[] getTelephoneNo() {
        return telephoneNo;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "customerName='" + customerName + '\'' +
                ", panCardNo='" + panCardNo + '\'' +
                ", voterId=" + voterId +
                ", passportNo='" + passportNo + '\'' +
                ", licenceNo=" + licenceNo +
                ", telephoneNo=" + Arrays.toString(telephoneNo) +
                '}';
    }
}
