package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint88 extends Uint {
    public static final Uint88 DEFAULT = new Uint88(BigInteger.ZERO);

    public Uint88(BigInteger bigInteger) {
        super(88, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint88(long j) {
        this(BigInteger.valueOf(j));
    }
}
