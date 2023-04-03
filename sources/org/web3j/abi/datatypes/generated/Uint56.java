package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint56 extends Uint {
    public static final Uint56 DEFAULT = new Uint56(BigInteger.ZERO);

    public Uint56(BigInteger bigInteger) {
        super(56, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint56(long j) {
        this(BigInteger.valueOf(j));
    }
}
