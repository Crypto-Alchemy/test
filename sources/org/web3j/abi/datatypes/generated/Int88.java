package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int88 extends Int {
    public static final Int88 DEFAULT = new Int88(BigInteger.ZERO);

    public Int88(BigInteger bigInteger) {
        super(88, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int88(long j) {
        this(BigInteger.valueOf(j));
    }
}
