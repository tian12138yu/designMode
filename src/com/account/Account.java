package com.account;

/**
 * @Author tjy
 * @Date 2020/4/22 19:46
 */


/**
 * 账户类，提供存钱和取钱，变更当前账户的状态方法。
 */
public class Account {

    AccountState state;
    String owner;

    public Account(String owner,double init){
        this.owner=owner;
        state = new GreenState(init,this);
        System.out.println(owner+"开户,初始金额为"+init);
    }

    public void setState(AccountState state){
        this.state = state;
    }

    public void deposit(double amount){
        System.out.println(owner+"存款"+amount);
        this.state.deposit(amount);
        System.out.println("现在余额为"+state.balance);
        System.out.println("现在的账户状态为"+state.getClass().getSimpleName());
    }

    public void withdraw(double amount){
        System.out.println(owner+"取款"+amount);
        this.state.withdraw(amount);
        System.out.println("现在余额为"+state.balance);
        System.out.println("现在的账户状态为"+state.getClass().getSimpleName());
    }

}
