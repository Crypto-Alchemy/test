package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int184 extends Int {
    public static final Int184 DEFAULT = new Int184(BigInteger.ZERO);

    public Int184(BigInteger bigInteger) {
        super(184, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int184(long j) {
        this(BigInteger.valueOf(j));
    }
}
