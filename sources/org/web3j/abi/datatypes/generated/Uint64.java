package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint64 extends Uint {
    public static final Uint64 DEFAULT = new Uint64(BigInteger.ZERO);

    public Uint64(BigInteger bigInteger) {
        super(64, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint64(long j) {
        this(BigInteger.valueOf(j));
    }
}
