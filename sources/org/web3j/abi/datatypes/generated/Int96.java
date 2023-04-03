package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int96 extends Int {
    public static final Int96 DEFAULT = new Int96(BigInteger.ZERO);

    public Int96(BigInteger bigInteger) {
        super(96, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int96(long j) {
        this(BigInteger.valueOf(j));
    }
}
