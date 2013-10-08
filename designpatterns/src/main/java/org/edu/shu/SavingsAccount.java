package org.edu.shu;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: paulsideleau
 * Date: 9/25/13
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class SavingsAccount implements Account {
    public float balance;

    public SavingsAccount(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }


    @Override
    public void deposit(float amount) {
        this.balance += amount;
    }

  /*  @Override
    amount;
        return new Rand public String deposit(float amount) {
        this.balance += Random().nextInt() + "";
    }       */
}
