package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint120 extends Uint {
    public static final Uint120 DEFAULT = new Uint120(BigInteger.ZERO);

    public Uint120(BigInteger bigInteger) {
        super(120, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint120(long j) {
        this(BigInteger.valueOf(j));
    }
}
