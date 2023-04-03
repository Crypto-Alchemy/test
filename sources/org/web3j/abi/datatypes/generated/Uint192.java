package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint192 extends Uint {
    public static final Uint192 DEFAULT = new Uint192(BigInteger.ZERO);

    public Uint192(BigInteger bigInteger) {
        super(192, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint192(long j) {
        this(BigInteger.valueOf(j));
    }
}
