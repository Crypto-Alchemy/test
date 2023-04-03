package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int144 extends Int {
    public static final Int144 DEFAULT = new Int144(BigInteger.ZERO);

    public Int144(BigInteger bigInteger) {
        super(144, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int144(long j) {
        this(BigInteger.valueOf(j));
    }
}
