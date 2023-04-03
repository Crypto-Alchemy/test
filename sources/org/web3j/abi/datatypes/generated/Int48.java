package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int48 extends Int {
    public static final Int48 DEFAULT = new Int48(BigInteger.ZERO);

    public Int48(BigInteger bigInteger) {
        super(48, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int48(long j) {
        this(BigInteger.valueOf(j));
    }
}
