package org.web3j.abi.datatypes;

import java.math.BigInteger;

public abstract class IntType extends NumericType {
    private final int bitSize;

    public IntType(String str, int i, BigInteger bigInteger) {
        super(str + i, bigInteger);
        this.bitSize = i;
        if (!valid()) {
            throw new UnsupportedOperationException("Bit size must be 8 bit aligned, and in range 0 < bitSize <= 256");
        }
    }

    private static boolean isValidBitCount(int i, BigInteger bigInteger) {
        if (bigInteger.bitLength() <= i) {
            return true;
        }
        return false;
    }

    private static boolean isValidBitSize(int i) {
        if (i % 8 != 0 || i <= 0 || i > 256) {
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

    public boolean valid() {
        if (!isValidBitSize(this.bitSize) || !isValidBitCount(this.bitSize, this.value)) {
            return false;
        }
        return true;
    }
}
