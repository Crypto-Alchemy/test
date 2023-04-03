package org.web3j.abi.datatypes;

import java.util.Arrays;

public abstract class BytesType implements fz6<byte[]> {
    private String type;
    private byte[] value;

    public BytesType(byte[] bArr, String str) {
        this.value = bArr;
        this.type = str;
    }

    public int bytes32PaddedLength() {
        byte[] bArr = this.value;
        if (bArr.length <= 32) {
            return 32;
        }
        return 32 * ((bArr.length / 32) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BytesType bytesType = (BytesType) obj;
        if (!Arrays.equals(this.value, bytesType.value)) {
            return false;
        }
        return this.type.equals(bytesType.type);
    }

    public String getTypeAsString() {
        return this.type;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.value) * 31) + this.type.hashCode();
    }

    public byte[] getValue() {
        return this.value;
    }
}
