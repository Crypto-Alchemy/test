package wallet.core.jni;

import java.security.InvalidParameterException;

public class SegwitAddress {
    private long nativeHandle;

    private SegwitAddress() {
        this.nativeHandle = 0;
    }

    public static SegwitAddress createFromNative(long j) {
        SegwitAddress segwitAddress = new SegwitAddress();
        segwitAddress.nativeHandle = j;
        SegwitAddressPhantomReference.register(segwitAddress, j);
        return segwitAddress;
    }

    public static native boolean equals(SegwitAddress segwitAddress, SegwitAddress segwitAddress2);

    public static native boolean isValidString(String str);

    public static native long nativeCreateWithPublicKey(HRP hrp, PublicKey publicKey);

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native String description();

    public native HRP hrp();

    public native byte[] witnessProgram();

    public native int witnessVersion();

    public SegwitAddress(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            SegwitAddressPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }

    public SegwitAddress(HRP hrp, PublicKey publicKey) {
        long nativeCreateWithPublicKey = nativeCreateWithPublicKey(hrp, publicKey);
        this.nativeHandle = nativeCreateWithPublicKey;
        if (nativeCreateWithPublicKey != 0) {
            SegwitAddressPhantomReference.register(this, nativeCreateWithPublicKey);
            return;
        }
        throw new InvalidParameterException();
    }
}
