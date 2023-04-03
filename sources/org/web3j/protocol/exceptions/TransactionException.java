package org.web3j.protocol.exceptions;

public class TransactionException extends Exception {
    private qi4<String> transactionHash = qi4.m50601a();
    private qi4<au6> transactionReceipt = qi4.m50601a();

    public TransactionException(String str) {
        super(str);
    }

    public qi4<String> getTransactionHash() {
        return this.transactionHash;
    }

    public qi4<au6> getTransactionReceipt() {
        return this.transactionReceipt;
    }

    public TransactionException(String str, String str2) {
        super(str);
        this.transactionHash = qi4.m50603e(str2);
    }

    public TransactionException(String str, au6 au6) {
        super(str);
        this.transactionReceipt = qi4.m50603e(au6);
    }

    public TransactionException(Throwable th) {
        super(th);
    }
}
