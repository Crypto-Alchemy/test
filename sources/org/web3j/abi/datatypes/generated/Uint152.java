package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint152 extends Uint {
    public static final Uint152 DEFAULT = new Uint152(BigInteger.ZERO);

    public Uint152(BigInteger bigInteger) {
        super(152, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint152(long j) {
        this(BigInteger.valueOf(j));
    }
}
