package org.web3j.abi;

public class TypeMappingException extends RuntimeException {
    public TypeMappingException(Exception exc) {
        super(exc);
    }

    public TypeMappingException(String str) {
        super(str);
    }

    public TypeMappingException(String str, Exception exc) {
        super(str, exc);
    }
}
