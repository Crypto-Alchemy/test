package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int16 extends Int {
    public static final Int16 DEFAULT = new Int16(BigInteger.ZERO);

    public Int16(BigInteger bigInteger) {
        super(16, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int16(long j) {
        this(BigInteger.valueOf(j));
    }
}
