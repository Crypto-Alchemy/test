package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint104 extends Uint {
    public static final Uint104 DEFAULT = new Uint104(BigInteger.ZERO);

    public Uint104(BigInteger bigInteger) {
        super(104, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint104(long j) {
        this(BigInteger.valueOf(j));
    }
}
