package org.web3j.crypto.exception;

public class CryptoWeb3jException extends RuntimeException {
    public CryptoWeb3jException() {
    }

    public CryptoWeb3jException(String str) {
        super(str);
    }

    public CryptoWeb3jException(String str, Throwable th) {
        super(str, th);
    }
}
