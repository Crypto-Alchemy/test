package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint112 extends Uint {
    public static final Uint112 DEFAULT = new Uint112(BigInteger.ZERO);

    public Uint112(BigInteger bigInteger) {
        super(112, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint112(long j) {
        this(BigInteger.valueOf(j));
    }
}
