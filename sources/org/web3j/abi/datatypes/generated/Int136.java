package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int136 extends Int {
    public static final Int136 DEFAULT = new Int136(BigInteger.ZERO);

    public Int136(BigInteger bigInteger) {
        super(136, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int136(long j) {
        this(BigInteger.valueOf(j));
    }
}
