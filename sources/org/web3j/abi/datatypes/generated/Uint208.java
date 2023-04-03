package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint208 extends Uint {
    public static final Uint208 DEFAULT = new Uint208(BigInteger.ZERO);

    public Uint208(BigInteger bigInteger) {
        super(208, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint208(long j) {
        this(BigInteger.valueOf(j));
    }
}
