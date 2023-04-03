package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint144 extends Uint {
    public static final Uint144 DEFAULT = new Uint144(BigInteger.ZERO);

    public Uint144(BigInteger bigInteger) {
        super(144, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint144(long j) {
        this(BigInteger.valueOf(j));
    }
}
