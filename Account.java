package com.company;

import com.sun.security.jgss.GSSUtil;
import jdk.swing.interop.SwingInterOpUtils;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String eMailAddress;
    private String phoneNumber;

    public Account() {
        System.out.println("Empty constructor");
    }

    public Account (String number, double balance, String customerName, String eMailAddress, String phoneNumber ) {

        System.out.println("Account constructor with parameter called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.eMailAddress = eMailAddress;
        this.phoneNumber = phoneNumber;


    }

    public void deposit ( double depositAmount) {
       this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);

    }

    public void withdrawal (double withdrawalAmount) {

        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
