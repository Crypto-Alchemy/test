package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint128 extends Uint {
    public static final Uint128 DEFAULT = new Uint128(BigInteger.ZERO);

    public Uint128(BigInteger bigInteger) {
        super(128, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint128(long j) {
        this(BigInteger.valueOf(j));
    }
}
