package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int24 extends Int {
    public static final Int24 DEFAULT = new Int24(BigInteger.ZERO);

    public Int24(BigInteger bigInteger) {
        super(24, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int24(long j) {
        this(BigInteger.valueOf(j));
    }
}
