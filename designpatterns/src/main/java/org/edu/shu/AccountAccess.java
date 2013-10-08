package org.edu.shu;

/**
 * Created with IntelliJ IDEA.
 * User: paulsideleau
 * Date: 9/25/13
 * Time: 8:18 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AccountAccess {
    public Account findAccount(String accountNumber);
    public void save(Account account);
}
