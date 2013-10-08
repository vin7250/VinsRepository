package org.edu.shu;

import java.util.concurrent.atomic.AtomicLong;


public class SavingsAccount implements Account {
    private static final AtomicLong currentId = new AtomicLong(0);

    private long id;
    private float balance;

    public SavingsAccount(float balance) {
        this.id = generateNewId();
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public long getId() {
        return id;
    }

    @Override
    public String deposit(float amount) {
        SavingsAccountTransaction trans = SavingsAccountTransaction.execute(this, amount);
        if (trans.getStatus() == Transaction.Status.SUCCESS) {
            this.balance += amount;
            return Long.toString(trans.getId());
        }
        return "Transaction failed";
    }

    @Override
    public String withdraw(float amount) {
        if (this.balance < amount) {
            return "Insufficient funds";
        }
        SavingsAccountTransaction trans = SavingsAccountTransaction.execute(this, amount * -1);
        if (trans.getStatus() == Transaction.Status.SUCCESS) {
            this.balance -= amount;
            return Long.toString(trans.getId());
        }
        return "Transaction failed";
    }

    private static long generateNewId() {
        return currentId.incrementAndGet();
    }
}
