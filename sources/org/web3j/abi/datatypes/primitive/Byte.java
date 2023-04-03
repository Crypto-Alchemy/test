package org.web3j.abi.datatypes.primitive;

import org.web3j.abi.datatypes.generated.Bytes1;

public final class Byte extends PrimitiveType<Byte> {
    public Byte(byte b) {
        super(Byte.valueOf(b));
    }

    public /* bridge */ /* synthetic */ int bytes32PaddedLength() {
        return ez6.m57503a(this);
    }

    public fz6 toSolidityType() {
        return new Bytes1(new byte[]{((Byte) getValue()).byteValue()});
    }
}
