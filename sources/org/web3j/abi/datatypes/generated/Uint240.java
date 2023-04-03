package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint240 extends Uint {
    public static final Uint240 DEFAULT = new Uint240(BigInteger.ZERO);

    public Uint240(BigInteger bigInteger) {
        super(240, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint240(long j) {
        this(BigInteger.valueOf(j));
    }
}
