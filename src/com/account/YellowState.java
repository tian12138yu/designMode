package com.account;

/**
 * @Author tjy
 * @Date 2020/4/22 19:48
 */


/**
 * 黄色账户类，当前状态可以存取。
 */
public class YellowState extends  AccountState{

    public YellowState(AccountState state){
        this.acc = state.acc;
        this.balance = state.balance;
    }
    @Override
    public void stateCheck() {
        if (balance >= 0){
            this.acc.setState(new GreenState(this));
        }else if(balance < -1000){
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
