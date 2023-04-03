package org.web3j.abi.datatypes;

import java.math.BigInteger;

public class Uint extends IntType {
    public static final Uint DEFAULT = new Uint(BigInteger.ZERO);
    public static final String TYPE_NAME = "uint";

    public Uint(int i, BigInteger bigInteger) {
        super(TYPE_NAME, i, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public boolean valid() {
        if (!super.valid() || this.value.signum() < 0) {
            return false;
        }
        return true;
    }

    public Uint(BigInteger bigInteger) {
        this(256, bigInteger);
    }
}
