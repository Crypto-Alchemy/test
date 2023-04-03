package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint80 extends Uint {
    public static final Uint80 DEFAULT = new Uint80(BigInteger.ZERO);

    public Uint80(BigInteger bigInteger) {
        super(80, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint80(long j) {
        this(BigInteger.valueOf(j));
    }
}
