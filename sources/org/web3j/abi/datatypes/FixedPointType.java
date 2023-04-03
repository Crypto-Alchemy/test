package org.web3j.abi.datatypes;

import java.math.BigInteger;

public abstract class FixedPointType extends NumericType {
    public static final int DEFAULT_BIT_LENGTH = 128;
    private final int bitSize;

    public FixedPointType(String str, int i, int i2, BigInteger bigInteger) {
        super(str + i + "x" + i2, bigInteger);
        this.bitSize = i + i2;
        if (!valid(i, i2, bigInteger)) {
            throw new UnsupportedOperationException("Bitsize must be 8 bit aligned, and in range 0 < bitSize <= 256");
        }
    }

    public static BigInteger convert(BigInteger bigInteger, BigInteger bigInteger2) {
        return convert(128, 128, bigInteger, bigInteger2);
    }

    private static boolean isValidBitCount(int i, int i2, BigInteger bigInteger) {
        if (bigInteger.bitCount() <= i + i2) {
            return true;
        }
        return false;
    }

    private boolean isValidBitSize(int i, int i2) {
        int i3;
        if (i % 8 != 0 || i2 % 8 != 0 || (i3 = this.bitSize) <= 0 || i3 > 256) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public int getBitSize() {
        return this.bitSize;
    }

    public boolean valid(int i, int i2, BigInteger bigInteger) {
        if (!isValidBitSize(i, i2) || !isValidBitCount(i, i2, bigInteger)) {
            return false;
        }
        return true;
    }

    public static BigInteger convert(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.shiftLeft(i2).or(bigInteger2.shiftLeft(i2 - ((bigInteger2.bitLength() + 3) & -4)));
    }
}
