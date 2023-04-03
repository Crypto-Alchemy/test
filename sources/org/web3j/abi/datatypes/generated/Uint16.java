package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint16 extends Uint {
    public static final Uint16 DEFAULT = new Uint16(BigInteger.ZERO);

    public Uint16(BigInteger bigInteger) {
        super(16, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint16(long j) {
        this(BigInteger.valueOf(j));
    }
}
