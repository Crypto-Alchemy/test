package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int128 extends Int {
    public static final Int128 DEFAULT = new Int128(BigInteger.ZERO);

    public Int128(BigInteger bigInteger) {
        super(128, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int128(long j) {
        this(BigInteger.valueOf(j));
    }
}
