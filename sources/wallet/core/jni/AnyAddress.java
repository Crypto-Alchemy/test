package wallet.core.jni;

import java.security.InvalidParameterException;

public class AnyAddress {
    private long nativeHandle;

    private AnyAddress() {
        this.nativeHandle = 0;
    }

    public static AnyAddress createFromNative(long j) {
        AnyAddress anyAddress = new AnyAddress();
        anyAddress.nativeHandle = j;
        AnyAddressPhantomReference.register(anyAddress, j);
        return anyAddress;
    }

    public static native boolean equals(AnyAddress anyAddress, AnyAddress anyAddress2);

    public static native boolean isValid(String str, CoinType coinType);

    public static native boolean isValidBech32(String str, CoinType coinType, String str2);

    public static native boolean isValidSS58(String str, CoinType coinType, int i);

    public static native long nativeCreateBech32(String str, CoinType coinType, String str2);

    public static native long nativeCreateBech32WithPublicKey(PublicKey publicKey, CoinType coinType, String str);

    public static native long nativeCreateSS58(String str, CoinType coinType, int i);

    public static native long nativeCreateSS58WithPublicKey(PublicKey publicKey, CoinType coinType, int i);

    public static native long nativeCreateWithPublicKey(PublicKey publicKey, CoinType coinType);

    public static native long nativeCreateWithPublicKeyDerivation(PublicKey publicKey, CoinType coinType, Derivation derivation);

    public static native long nativeCreateWithString(String str, CoinType coinType);

    public static native void nativeDelete(long j);

    public native CoinType coin();

    public native byte[] data();

    public native String description();

    public AnyAddress(String str, CoinType coinType) {
        long nativeCreateWithString = nativeCreateWithString(str, coinType);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            AnyAddressPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }

    public AnyAddress(String str, CoinType coinType, String str2) {
        long nativeCreateBech32 = nativeCreateBech32(str, coinType, str2);
        this.nativeHandle = nativeCreateBech32;
        if (nativeCreateBech32 != 0) {
            AnyAddressPhantomReference.register(this, nativeCreateBech32);
            return;
        }
        throw new InvalidParameterException();
    }

    public AnyAddress(String str, CoinType coinType, int i) {
        long nativeCreateSS58 = nativeCreateSS58(str, coinType, i);
        this.nativeHandle = nativeCreateSS58;
        if (nativeCreateSS58 != 0) {
            AnyAddressPhantomReference.register(this, nativeCreateSS58);
            return;
        }
        throw new InvalidParameterException();
    }

    public AnyAddress(PublicKey publicKey, CoinType coinType) {
        long nativeCreateWithPublicKey = nativeCreateWithPublicKey(publicKey, coinType);
        this.nativeHandle = nativeCreateWithPublicKey;
        if (nativeCreateWithPublicKey != 0) {
            AnyAddressPhantomReference.register(this, nativeCreateWithPublicKey);
            return;
        }
        throw new InvalidParameterException();
    }

    public AnyAddress(PublicKey publicKey, CoinType coinType, Derivation derivation) {
        long nativeCreateWithPublicKeyDerivation = nativeCreateWithPublicKeyDerivation(publicKey, coinType, derivation);
        this.nativeHandle = nativeCreateWithPublicKeyDerivation;
        if (nativeCreateWithPublicKeyDerivation != 0) {
            AnyAddressPhantomReference.register(this, nativeCreateWithPublicKeyDerivation);
            return;
        }
        throw new InvalidParameterException();
    }

    public AnyAddress(PublicKey publicKey, CoinType coinType, String str) {
        long nativeCreateBech32WithPublicKey = nativeCreateBech32WithPublicKey(publicKey, coinType, str);
        this.nativeHandle = nativeCreateBech32WithPublicKey;
        if (nativeCreateBech32WithPublicKey != 0) {
            AnyAddressPhantomReference.register(this, nativeCreateBech32WithPublicKey);
            return;
        }
        throw new InvalidParameterException();
    }

    public AnyAddress(PublicKey publicKey, CoinType coinType, int i) {
        long nativeCreateSS58WithPublicKey = nativeCreateSS58WithPublicKey(publicKey, coinType, i);
        this.nativeHandle = nativeCreateSS58WithPublicKey;
        if (nativeCreateSS58WithPublicKey != 0) {
            AnyAddressPhantomReference.register(this, nativeCreateSS58WithPublicKey);
            return;
        }
        throw new InvalidParameterException();
    }
}
