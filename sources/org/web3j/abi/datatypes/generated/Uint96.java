package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint96 extends Uint {
    public static final Uint96 DEFAULT = new Uint96(BigInteger.ZERO);

    public Uint96(BigInteger bigInteger) {
        super(96, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint96(long j) {
        this(BigInteger.valueOf(j));
    }
}
