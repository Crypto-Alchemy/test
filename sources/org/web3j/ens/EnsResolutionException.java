package org.web3j.ens;

public class EnsResolutionException extends RuntimeException {
    public EnsResolutionException(String str) {
        super(str);
    }

    public EnsResolutionException(String str, Throwable th) {
        super(str, th);
    }
}
