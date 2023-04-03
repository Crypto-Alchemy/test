package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint248 extends Uint {
    public static final Uint248 DEFAULT = new Uint248(BigInteger.ZERO);

    public Uint248(BigInteger bigInteger) {
        super(248, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint248(long j) {
        this(BigInteger.valueOf(j));
    }
}
