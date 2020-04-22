package com.account;

/**
 * @Author tjy
 * @Date 2020/4/22 19:47
 */

/**
 * 绿色账户类，当前状态可以存取。
 */
public class GreenState extends AccountState{

    public GreenState(AccountState state){
        this.acc = state.acc;
        this.balance = state.balance;
    }

    public GreenState(double balance, Account acc){
        this.acc = acc;
        this.balance = balance;
    }

    @Override
    public void stateCheck() {
        if (this.balance < 0 && this.balance >= -1000){
            this.acc.setState(new YellowState(this));

        }else if (this.balance < -1000){
            this.acc.setState(new RedState(this));
        }
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        this.stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
        this.stateCheck();
    }
}
