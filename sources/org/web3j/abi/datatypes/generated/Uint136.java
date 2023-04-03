package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint136 extends Uint {
    public static final Uint136 DEFAULT = new Uint136(BigInteger.ZERO);

    public Uint136(BigInteger bigInteger) {
        super(136, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint136(long j) {
        this(BigInteger.valueOf(j));
    }
}
