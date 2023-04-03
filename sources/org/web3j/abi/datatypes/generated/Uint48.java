package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint48 extends Uint {
    public static final Uint48 DEFAULT = new Uint48(BigInteger.ZERO);

    public Uint48(BigInteger bigInteger) {
        super(48, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint48(long j) {
        this(BigInteger.valueOf(j));
    }
}
