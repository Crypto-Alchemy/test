package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int208 extends Int {
    public static final Int208 DEFAULT = new Int208(BigInteger.ZERO);

    public Int208(BigInteger bigInteger) {
        super(208, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int208(long j) {
        this(BigInteger.valueOf(j));
    }
}
