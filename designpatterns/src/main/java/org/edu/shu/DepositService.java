package org.edu.shu;

/**
 * Created with IntelliJ IDEA.
 * User: paulsideleau
 * Date: 9/25/13
 * Time: 8:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class DepositService {

    private AccountAccess access;

    public DepositService(AccountAccess access) {
        this.access = access;
    }

    public void deposit(float amount, String accountNumber){
        Account account = access.findAccount(accountNumber);
        account.deposit(amount);
        access.save(account);
    }

  /*  public String deposit(float amount, String accountNumber)
    {
        Account account = access.findAccount(accountNumber);
        String transactionNumber = account.deposit(amount);
        access.save(account);

        return transactionNumber;
    }        */
}
