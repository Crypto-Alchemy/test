package org.web3j.p025tx.exceptions;

import java.io.IOException;

/* renamed from: org.web3j.tx.exceptions.TxHashMismatchException */
public class TxHashMismatchException extends IOException {
    private String txHashLocal;
    private String txHashRemote;

    public TxHashMismatchException(String str, String str2) {
        this.txHashLocal = str;
        this.txHashRemote = str2;
    }

    public String getTxHashLocal() {
        return this.txHashLocal;
    }

    public String getTxHashRemote() {
        return this.txHashRemote;
    }
}
