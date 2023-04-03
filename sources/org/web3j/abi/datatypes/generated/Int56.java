package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int56 extends Int {
    public static final Int56 DEFAULT = new Int56(BigInteger.ZERO);

    public Int56(BigInteger bigInteger) {
        super(56, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int56(long j) {
        this(BigInteger.valueOf(j));
    }
}
