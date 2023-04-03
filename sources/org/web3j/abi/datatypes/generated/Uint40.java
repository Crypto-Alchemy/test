package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint40 extends Uint {
    public static final Uint40 DEFAULT = new Uint40(BigInteger.ZERO);

    public Uint40(BigInteger bigInteger) {
        super(40, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint40(long j) {
        this(BigInteger.valueOf(j));
    }
}
