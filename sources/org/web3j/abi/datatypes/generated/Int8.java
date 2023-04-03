package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int8 extends Int {
    public static final Int8 DEFAULT = new Int8(BigInteger.ZERO);

    public Int8(BigInteger bigInteger) {
        super(8, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int8(long j) {
        this(BigInteger.valueOf(j));
    }
}
