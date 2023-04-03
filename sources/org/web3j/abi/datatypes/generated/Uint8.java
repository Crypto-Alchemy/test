package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint8 extends Uint {
    public static final Uint8 DEFAULT = new Uint8(BigInteger.ZERO);

    public Uint8(BigInteger bigInteger) {
        super(8, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint8(long j) {
        this(BigInteger.valueOf(j));
    }
}
