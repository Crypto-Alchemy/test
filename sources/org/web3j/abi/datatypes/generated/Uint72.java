package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint72 extends Uint {
    public static final Uint72 DEFAULT = new Uint72(BigInteger.ZERO);

    public Uint72(BigInteger bigInteger) {
        super(72, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint72(long j) {
        this(BigInteger.valueOf(j));
    }
}
