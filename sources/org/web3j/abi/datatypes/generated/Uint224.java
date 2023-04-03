package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint224 extends Uint {
    public static final Uint224 DEFAULT = new Uint224(BigInteger.ZERO);

    public Uint224(BigInteger bigInteger) {
        super(224, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint224(long j) {
        this(BigInteger.valueOf(j));
    }
}
