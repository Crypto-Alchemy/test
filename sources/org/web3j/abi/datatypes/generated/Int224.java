package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int224 extends Int {
    public static final Int224 DEFAULT = new Int224(BigInteger.ZERO);

    public Int224(BigInteger bigInteger) {
        super(224, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int224(long j) {
        this(BigInteger.valueOf(j));
    }
}
