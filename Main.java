package com.company;

public class Main {

    public static void main(String[] args) {



        Account bobsAccount = new Account("31241", 0, "bob ross", "myemail.com", "091924141");

        bobsAccount.withdrawal(150);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(150);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);

    }
}
