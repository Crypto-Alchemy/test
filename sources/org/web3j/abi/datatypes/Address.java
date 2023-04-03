package org.web3j.abi.datatypes;

import java.math.BigInteger;

public class Address implements fz6<String> {
    public static final Address DEFAULT = new Address(BigInteger.ZERO);
    public static final int DEFAULT_LENGTH = 160;
    public static final String TYPE_NAME = "address";
    private final Uint value;

    public Address(Uint uint) {
        this.value = uint;
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
        Address address = (Address) obj;
        Uint uint = this.value;
        if (uint != null) {
            return uint.value.equals(address.value.value);
        }
        if (address.value == null) {
            return true;
        }
        return false;
    }

    public String getTypeAsString() {
        return TYPE_NAME;
    }

    public int hashCode() {
        Uint uint = this.value;
        if (uint != null) {
            return uint.hashCode();
        }
        return 0;
    }

    public String toString() {
        return pc4.toHexStringWithPrefixZeroPadded(this.value.getValue(), this.value.getBitSize() >> 2);
    }

    public Uint toUint() {
        return this.value;
    }

    public String getValue() {
        return toString();
    }

    public Address(BigInteger bigInteger) {
        this(160, bigInteger);
    }

    public Address(int i, BigInteger bigInteger) {
        this(new Uint(i, bigInteger));
    }

    public Address(String str) {
        this(160, str);
    }

    public Address(int i, String str) {
        this(i, pc4.toBigInt(str));
    }
}
