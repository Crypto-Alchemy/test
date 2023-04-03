package org.web3j.abi.datatypes.generated;

import org.web3j.abi.datatypes.Bytes;

public class Bytes16 extends Bytes {
    public static final Bytes16 DEFAULT = new Bytes16(new byte[16]);

    public Bytes16(byte[] bArr) {
        super(16, bArr);
    }
}
