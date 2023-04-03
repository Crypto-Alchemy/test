package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint176 extends Uint {
    public static final Uint176 DEFAULT = new Uint176(BigInteger.ZERO);

    public Uint176(BigInteger bigInteger) {
        super(176, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint176(long j) {
        this(BigInteger.valueOf(j));
    }
}
