package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int80 extends Int {
    public static final Int80 DEFAULT = new Int80(BigInteger.ZERO);

    public Int80(BigInteger bigInteger) {
        super(80, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int80(long j) {
        this(BigInteger.valueOf(j));
    }
}
