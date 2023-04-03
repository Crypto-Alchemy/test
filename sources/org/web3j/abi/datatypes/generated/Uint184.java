package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint184 extends Uint {
    public static final Uint184 DEFAULT = new Uint184(BigInteger.ZERO);

    public Uint184(BigInteger bigInteger) {
        super(184, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint184(long j) {
        this(BigInteger.valueOf(j));
    }
}
