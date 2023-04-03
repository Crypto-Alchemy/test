package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint168 extends Uint {
    public static final Uint168 DEFAULT = new Uint168(BigInteger.ZERO);

    public Uint168(BigInteger bigInteger) {
        super(168, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint168(long j) {
        this(BigInteger.valueOf(j));
    }
}
