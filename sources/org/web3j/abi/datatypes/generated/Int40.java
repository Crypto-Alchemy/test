package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int40 extends Int {
    public static final Int40 DEFAULT = new Int40(BigInteger.ZERO);

    public Int40(BigInteger bigInteger) {
        super(40, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int40(long j) {
        this(BigInteger.valueOf(j));
    }
}
