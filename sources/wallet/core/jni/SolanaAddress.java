package wallet.core.jni;

import java.security.InvalidParameterException;

public class SolanaAddress {
    private long nativeHandle;

    private SolanaAddress() {
        this.nativeHandle = 0;
    }

    public static SolanaAddress createFromNative(long j) {
        SolanaAddress solanaAddress = new SolanaAddress();
        solanaAddress.nativeHandle = j;
        SolanaAddressPhantomReference.register(solanaAddress, j);
        return solanaAddress;
    }

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native String defaultTokenAddress(String str);

    public native String description();

    public SolanaAddress(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            SolanaAddressPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }
}
