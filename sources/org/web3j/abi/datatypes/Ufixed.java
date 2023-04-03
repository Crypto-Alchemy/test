package org.web3j.abi.datatypes;

import java.math.BigInteger;

public class Ufixed extends FixedPointType {
    public static final Ufixed DEFAULT = new Ufixed(BigInteger.ZERO);
    public static final String TYPE_NAME = "ufixed";

    public Ufixed(int i, int i2, BigInteger bigInteger) {
        super(TYPE_NAME, i, i2, bigInteger);
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public boolean valid(int i, int i2, BigInteger bigInteger) {
        if (!super.valid(i, i2, bigInteger) || bigInteger.signum() == -1) {
            return false;
        }
        return true;
    }

    public Ufixed(BigInteger bigInteger) {
        this(128, 128, bigInteger);
    }

    public Ufixed(BigInteger bigInteger, BigInteger bigInteger2) {
        this(FixedPointType.convert(bigInteger, bigInteger2));
    }

    public Ufixed(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2) {
        this(FixedPointType.convert(i, i2, bigInteger, bigInteger2));
    }
}
