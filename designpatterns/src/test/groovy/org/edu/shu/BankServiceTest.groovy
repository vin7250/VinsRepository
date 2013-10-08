package org.edu.shu

import spock.lang.Specification


/**
 * Created with IntelliJ IDEA.
 * User: paulsideleau
 * Date: 9/25/13
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
class BankServiceTest extends Specification {

    def "should deposit money to account"()
    {
        given: "As a customer I want to deposit money to my savings account"
          AccountAccess access = Mock(AccountAccess)
          Account account = Mock(Account)
          DepositService depositService = new DepositService(access)
        when: "I deposit the money"
          String transactionNumber = depositService.deposit(100.00, "232-32342-9829")

        then: "I should get a transaction number"
           (1.._) * access.findAccount("232-32342-9829")  >>  account
           (1) * account.deposit(100.00) >> "123"
           (1) * access.save(account);

           transactionNumber == "123"

    }

}