package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int256 extends Int {
    public static final Int256 DEFAULT = new Int256(BigInteger.ZERO);

    public Int256(BigInteger bigInteger) {
        super(256, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int256(long j) {
        this(BigInteger.valueOf(j));
    }
}
