package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint24 extends Uint {
    public static final Uint24 DEFAULT = new Uint24(BigInteger.ZERO);

    public Uint24(BigInteger bigInteger) {
        super(24, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint24(long j) {
        this(BigInteger.valueOf(j));
    }
}
