package wallet.core.jni;

import java.security.InvalidParameterException;

public class GroestlcoinAddress {
    private long nativeHandle;

    private GroestlcoinAddress() {
        this.nativeHandle = 0;
    }

    public static GroestlcoinAddress createFromNative(long j) {
        GroestlcoinAddress groestlcoinAddress = new GroestlcoinAddress();
        groestlcoinAddress.nativeHandle = j;
        GroestlcoinAddressPhantomReference.register(groestlcoinAddress, j);
        return groestlcoinAddress;
    }

    public static native boolean equals(GroestlcoinAddress groestlcoinAddress, GroestlcoinAddress groestlcoinAddress2);

    public static native boolean isValidString(String str);

    public static native long nativeCreateWithPublicKey(PublicKey publicKey, byte b);

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native String description();

    public GroestlcoinAddress(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            GroestlcoinAddressPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }

    public GroestlcoinAddress(PublicKey publicKey, byte b) {
        long nativeCreateWithPublicKey = nativeCreateWithPublicKey(publicKey, b);
        this.nativeHandle = nativeCreateWithPublicKey;
        if (nativeCreateWithPublicKey != 0) {
            GroestlcoinAddressPhantomReference.register(this, nativeCreateWithPublicKey);
            return;
        }
        throw new InvalidParameterException();
    }
}
