package org.web3j.exceptions;

public class MessageEncodingException extends RuntimeException {
    public MessageEncodingException(String str) {
        super(str);
    }

    public MessageEncodingException(String str, Throwable th) {
        super(str, th);
    }
}
