package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int64 extends Int {
    public static final Int64 DEFAULT = new Int64(BigInteger.ZERO);

    public Int64(BigInteger bigInteger) {
        super(64, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int64(long j) {
        this(BigInteger.valueOf(j));
    }
}
