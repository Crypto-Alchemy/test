package wallet.core.jni;

import java.security.InvalidParameterException;

public class RippleXAddress {
    private long nativeHandle;

    private RippleXAddress() {
        this.nativeHandle = 0;
    }

    public static RippleXAddress createFromNative(long j) {
        RippleXAddress rippleXAddress = new RippleXAddress();
        rippleXAddress.nativeHandle = j;
        RippleXAddressPhantomReference.register(rippleXAddress, j);
        return rippleXAddress;
    }

    public static native boolean equals(RippleXAddress rippleXAddress, RippleXAddress rippleXAddress2);

    public static native boolean isValidString(String str);

    public static native long nativeCreateWithPublicKey(PublicKey publicKey, int i);

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native String description();

    public native int tag();

    public RippleXAddress(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            RippleXAddressPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }

    public RippleXAddress(PublicKey publicKey, int i) {
        long nativeCreateWithPublicKey = nativeCreateWithPublicKey(publicKey, i);
        this.nativeHandle = nativeCreateWithPublicKey;
        if (nativeCreateWithPublicKey != 0) {
            RippleXAddressPhantomReference.register(this, nativeCreateWithPublicKey);
            return;
        }
        throw new InvalidParameterException();
    }
}
