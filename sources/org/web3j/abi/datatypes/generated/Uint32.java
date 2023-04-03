package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint32 extends Uint {
    public static final Uint32 DEFAULT = new Uint32(BigInteger.ZERO);

    public Uint32(BigInteger bigInteger) {
        super(32, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint32(long j) {
        this(BigInteger.valueOf(j));
    }
}
