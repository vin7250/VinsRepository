package org.edu.shu;
import java.util.Random;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: usavxf3
 * Date: 10/2/13
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionGeneration {

    public String GenerateTransactionNumber() {
        UUID uuid = UUID.randomUUID();
        String transactionNumber = uuid.toString();
        assert transactionNumber != null;
    return transactionNumber;
    }
}
