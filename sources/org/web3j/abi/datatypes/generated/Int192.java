package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int192 extends Int {
    public static final Int192 DEFAULT = new Int192(BigInteger.ZERO);

    public Int192(BigInteger bigInteger) {
        super(192, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int192(long j) {
        this(BigInteger.valueOf(j));
    }
}
