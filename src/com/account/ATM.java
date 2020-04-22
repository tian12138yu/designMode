package com.account;

/**
 * @Author tjy
 * @Date 2020/4/22 20:32
 */

public class ATM {

    public static void main(String[] args) {
        Account account = new Account("田嘉禹", 5.0);
        account.deposit(100);
        account.withdraw(200);
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(100);
    }
}
