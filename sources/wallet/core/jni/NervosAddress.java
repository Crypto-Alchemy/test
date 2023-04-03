package wallet.core.jni;

import java.security.InvalidParameterException;

public class NervosAddress {
    private long nativeHandle;

    private NervosAddress() {
        this.nativeHandle = 0;
    }

    public static NervosAddress createFromNative(long j) {
        NervosAddress nervosAddress = new NervosAddress();
        nervosAddress.nativeHandle = j;
        NervosAddressPhantomReference.register(nervosAddress, j);
        return nervosAddress;
    }

    public static native boolean equals(NervosAddress nervosAddress, NervosAddress nervosAddress2);

    public static native boolean isValidString(String str);

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native byte[] args();

    public native byte[] codeHash();

    public native String description();

    public native String hashType();

    public NervosAddress(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            NervosAddressPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }
}
