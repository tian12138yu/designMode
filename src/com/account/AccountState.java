package com.account;

/**
 * @Author tjy
 * @Date 2020/4/22 19:47
 */

/**
 * 账户类状态的抽象类，提供存钱和取钱，检查当前状态方法。
 */
public abstract class AccountState {

    Account acc;
    double balance;

    public abstract void stateCheck();

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
