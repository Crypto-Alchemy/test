package wallet.core.jni;

import java.security.InvalidParameterException;

public class BitcoinAddress {
    private long nativeHandle;

    private BitcoinAddress() {
        this.nativeHandle = 0;
    }

    public static BitcoinAddress createFromNative(long j) {
        BitcoinAddress bitcoinAddress = new BitcoinAddress();
        bitcoinAddress.nativeHandle = j;
        BitcoinAddressPhantomReference.register(bitcoinAddress, j);
        return bitcoinAddress;
    }

    public static native boolean equals(BitcoinAddress bitcoinAddress, BitcoinAddress bitcoinAddress2);

    public static native boolean isValid(byte[] bArr);

    public static native boolean isValidString(String str);

    public static native long nativeCreateWithData(byte[] bArr);

    public static native long nativeCreateWithPublicKey(PublicKey publicKey, byte b);

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native String description();

    public native byte[] keyhash();

    public native byte prefix();

    public BitcoinAddress(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            BitcoinAddressPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }

    public BitcoinAddress(byte[] bArr) {
        long nativeCreateWithData = nativeCreateWithData(bArr);
        this.nativeHandle = nativeCreateWithData;
        if (nativeCreateWithData != 0) {
            BitcoinAddressPhantomReference.register(this, nativeCreateWithData);
            return;
        }
        throw new InvalidParameterException();
    }

    public BitcoinAddress(PublicKey publicKey, byte b) {
        long nativeCreateWithPublicKey = nativeCreateWithPublicKey(publicKey, b);
        this.nativeHandle = nativeCreateWithPublicKey;
        if (nativeCreateWithPublicKey != 0) {
            BitcoinAddressPhantomReference.register(this, nativeCreateWithPublicKey);
            return;
        }
        throw new InvalidParameterException();
    }
}
