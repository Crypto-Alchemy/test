package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int232 extends Int {
    public static final Int232 DEFAULT = new Int232(BigInteger.ZERO);

    public Int232(BigInteger bigInteger) {
        super(232, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int232(long j) {
        this(BigInteger.valueOf(j));
    }
}
