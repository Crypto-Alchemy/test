package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int176 extends Int {
    public static final Int176 DEFAULT = new Int176(BigInteger.ZERO);

    public Int176(BigInteger bigInteger) {
        super(176, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int176(long j) {
        this(BigInteger.valueOf(j));
    }
}
