package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int152 extends Int {
    public static final Int152 DEFAULT = new Int152(BigInteger.ZERO);

    public Int152(BigInteger bigInteger) {
        super(152, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int152(long j) {
        this(BigInteger.valueOf(j));
    }
}
