package org.web3j.abi.datatypes.generated;

import org.web3j.abi.datatypes.Bytes;

public class Bytes20 extends Bytes {
    public static final Bytes20 DEFAULT = new Bytes20(new byte[20]);

    public Bytes20(byte[] bArr) {
        super(20, bArr);
    }
}
