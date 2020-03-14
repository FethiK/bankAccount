package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;





    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance ( double balance) {
        this.balance = balance;
    }
    public void setCustomerName( String customerName) {
        this.customerName = customerName;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public double moneyIn (double moneyIn) {

return this.balance = balance + moneyIn;



    }

    public double moneyOut (double moneyOut) {
        if (moneyOut > balance) {
            System.out.println("Hi" + customerName + "Your fund is insufficient");
        } else {
            System.out.println("Hi " + customerName +  "new balance is " + (this.balance = balance - moneyOut));
        }
     return -1;
    }

    public void getAccountNumber (String accountNumber) {

        this.accountNumber = accountNumber;
    }

    public void getCustomerName( String customerName) {
        this.customerName = customerName;
    }
    public void getEmail (String email) {
        this.email = email;
    }
    public void getPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;


    }
}



