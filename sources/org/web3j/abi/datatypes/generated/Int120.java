package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int120 extends Int {
    public static final Int120 DEFAULT = new Int120(BigInteger.ZERO);

    public Int120(BigInteger bigInteger) {
        super(120, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int120(long j) {
        this(BigInteger.valueOf(j));
    }
}
