package org.web3j.abi.datatypes.primitive;

import org.web3j.abi.datatypes.Utf8String;

public final class Char extends PrimitiveType<Character> {
    public Char(char c) {
        super(Character.valueOf(c));
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public fz6 toSolidityType() {
        return new Utf8String(String.valueOf(getValue()));
    }
}
