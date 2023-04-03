package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint160 extends Uint {
    public static final Uint160 DEFAULT = new Uint160(BigInteger.ZERO);

    public Uint160(BigInteger bigInteger) {
        super(160, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint160(long j) {
        this(BigInteger.valueOf(j));
    }
}
