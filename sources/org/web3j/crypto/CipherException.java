package org.web3j.crypto;

public class CipherException extends Exception {
    public CipherException(String str) {
        super(str);
    }

    public CipherException(Throwable th) {
        super(th);
    }

    public CipherException(String str, Throwable th) {
        super(str, th);
    }
}
