package org.web3j.protocol.core.filters;

public class FilterException extends RuntimeException {
    public FilterException(String str) {
        super(str);
    }

    public FilterException(String str, Throwable th) {
        super(str, th);
    }
}
