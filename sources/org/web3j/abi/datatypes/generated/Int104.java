package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int104 extends Int {
    public static final Int104 DEFAULT = new Int104(BigInteger.ZERO);

    public Int104(BigInteger bigInteger) {
        super(104, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int104(long j) {
        this(BigInteger.valueOf(j));
    }
}
