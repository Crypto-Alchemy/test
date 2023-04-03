package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int248 extends Int {
    public static final Int248 DEFAULT = new Int248(BigInteger.ZERO);

    public Int248(BigInteger bigInteger) {
        super(248, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int248(long j) {
        this(BigInteger.valueOf(j));
    }
}
