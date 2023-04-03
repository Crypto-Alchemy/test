package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Int;

public class Int240 extends Int {
    public static final Int240 DEFAULT = new Int240(BigInteger.ZERO);

    public Int240(BigInteger bigInteger) {
        super(240, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Int240(long j) {
        this(BigInteger.valueOf(j));
    }
}
