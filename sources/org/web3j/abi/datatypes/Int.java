package org.web3j.abi.datatypes;

import java.math.BigInteger;

public class Int extends IntType {
    public static final Int DEFAULT = new Int(BigInteger.ZERO);
    public static final String TYPE_NAME = "int";

    public Int(BigInteger bigInteger) {
        this(256, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int(int i, BigInteger bigInteger) {
        super(TYPE_NAME, i, bigInteger);
    }
}
