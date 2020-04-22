package com.account;

/**
 * @Author tjy
 * @Date 2020/4/22 19:47
 */


/**
 * 红色账户类，当前状态只可以存，不可以进行取。
 */
public class RedState extends AccountState{

    public RedState(AccountState state) {
        this.acc = state.acc;
        this.balance = state.balance;
    }

    @Override
    public void stateCheck() {
        if (this.balance >= -1000 && this.balance < 0){
            acc.setState(new YellowState(this));
        } else if (this.balance >=0 ) {
            acc.setState(new GreenState(this));
        }
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        this.stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账户被冻结，取款失败！");
    }


}
