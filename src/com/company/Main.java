package com.company;


public class Main {

    public static void main(String[] args) {


        Account jesusAccount = new Account("12345", 0.00, "Jesus Sand", "jsand@gmail.com", "(123) 123-1234");
        System.out.println(jesusAccount.getAccountNumber());
        System.out.println(jesusAccount.getCustomerEmailAddress());

        jesusAccount.withdraw(100.0);


        jesusAccount.deposit(50.0);
        jesusAccount.withdraw(100.0);

        jesusAccount.deposit(51.0);
        jesusAccount.withdraw(100.0);





    }



}
