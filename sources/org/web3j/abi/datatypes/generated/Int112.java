package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int112 extends Int {
    public static final Int112 DEFAULT = new Int112(BigInteger.ZERO);

    public Int112(BigInteger bigInteger) {
        super(112, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int112(long j) {
        this(BigInteger.valueOf(j));
    }
}
