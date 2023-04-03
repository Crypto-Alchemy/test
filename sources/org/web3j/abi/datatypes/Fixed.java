package org.web3j.abi.datatypes;

import java.math.BigInteger;

public class Fixed extends FixedPointType {
    public static final Fixed DEFAULT = new Fixed(BigInteger.ZERO);
    public static final String TYPE_NAME = "fixed";

    public Fixed(int i, int i2, BigInteger bigInteger) {
        super(TYPE_NAME, i, i2, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public Fixed(BigInteger bigInteger) {
        this(128, 128, bigInteger);
    }

    public Fixed(BigInteger bigInteger, BigInteger bigInteger2) {
        this(FixedPointType.convert(bigInteger, bigInteger2));
    }

    public Fixed(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2) {
        this(FixedPointType.convert(i, i2, bigInteger, bigInteger2));
    }
}
