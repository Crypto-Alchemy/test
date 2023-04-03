package org.web3j.abi.datatypes;

import java.math.BigInteger;

public abstract class NumericType implements fz6<BigInteger> {
    private String type;
    public BigInteger value;

    public NumericType(String str, BigInteger bigInteger) {
        this.type = str;
        this.value = bigInteger;
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NumericType numericType = (NumericType) obj;
        if (!this.type.equals(numericType.type)) {
            return false;
        }
        BigInteger bigInteger = this.value;
        BigInteger bigInteger2 = numericType.value;
        if (bigInteger != null) {
            return bigInteger.equals(bigInteger2);
        }
        if (bigInteger2 == null) {
            return true;
        }
        return false;
    }

    public abstract int getBitSize();

    public String getTypeAsString() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int hashCode = this.type.hashCode() * 31;
        BigInteger bigInteger = this.value;
        if (bigInteger != null) {
            i = bigInteger.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public BigInteger getValue() {
        return this.value;
    }
}
