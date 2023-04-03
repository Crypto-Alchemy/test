package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int72 extends Int {
    public static final Int72 DEFAULT = new Int72(BigInteger.ZERO);

    public Int72(BigInteger bigInteger) {
        super(72, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int72(long j) {
        this(BigInteger.valueOf(j));
    }
}
