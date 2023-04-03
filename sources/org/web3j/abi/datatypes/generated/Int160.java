package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int160 extends Int {
    public static final Int160 DEFAULT = new Int160(BigInteger.ZERO);

    public Int160(BigInteger bigInteger) {
        super(160, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int160(long j) {
        this(BigInteger.valueOf(j));
    }
}
