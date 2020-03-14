package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount bankAccount = new BankAccount();

        bankAccount.setCustomerName("Fethi");
        bankAccount.setAccountNumber("28921610740");
        bankAccount.setEmail("karakayaa.fethi@gmail.com");
        bankAccount.setPhoneNumber("447376573663");
        bankAccount.setBalance(1500);

        
        System.out.println(bankAccount.moneyIn(200));


    }
}
