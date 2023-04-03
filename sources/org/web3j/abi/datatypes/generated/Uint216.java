package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Uint;

public class Uint216 extends Uint {
    public static final Uint216 DEFAULT = new Uint216(BigInteger.ZERO);

    public Uint216(BigInteger bigInteger) {
        super(216, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Uint216(long j) {
        this(BigInteger.valueOf(j));
    }
}
