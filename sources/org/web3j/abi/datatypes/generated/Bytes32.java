package org.web3j.abi.datatypes.generated;

import org.web3j.abi.datatypes.Bytes;

public class Bytes32 extends Bytes {
    public static final Bytes32 DEFAULT = new Bytes32(new byte[32]);

    public Bytes32(byte[] bArr) {
        super(32, bArr);
    }
}
