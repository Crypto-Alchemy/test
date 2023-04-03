package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int216 extends Int {
    public static final Int216 DEFAULT = new Int216(BigInteger.ZERO);

    public Int216(BigInteger bigInteger) {
        super(216, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int216(long j) {
        this(BigInteger.valueOf(j));
    }
}
