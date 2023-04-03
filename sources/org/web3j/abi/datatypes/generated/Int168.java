package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int168 extends Int {
    public static final Int168 DEFAULT = new Int168(BigInteger.ZERO);

    public Int168(BigInteger bigInteger) {
        super(168, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int168(long j) {
        this(BigInteger.valueOf(j));
    }
}
