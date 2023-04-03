package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint232 extends Uint {
    public static final Uint232 DEFAULT = new Uint232(BigInteger.ZERO);

    public Uint232(BigInteger bigInteger) {
        super(232, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint232(long j) {
        this(BigInteger.valueOf(j));
    }
}
