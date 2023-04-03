package org.web3j.exceptions;

public class MessageDecodingException extends RuntimeException {
    public MessageDecodingException(String str) {
        super(str);
    }

    public MessageDecodingException(String str, Throwable th) {
        super(str, th);
    }
}
