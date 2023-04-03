package wallet.core.jni;

import java.security.InvalidParameterException;

public class PublicKey {
    private long nativeHandle;

    private PublicKey() {
        this.nativeHandle = 0;
    }

    public static PublicKey createFromNative(long j) {
        PublicKey publicKey = new PublicKey();
        publicKey.nativeHandle = j;
        PublicKeyPhantomReference.register(publicKey, j);
        return publicKey;
    }

    public static native boolean isValid(byte[] bArr, PublicKeyType publicKeyType);

    public static native long nativeCreateWithData(byte[] bArr, PublicKeyType publicKeyType);

    public static native void nativeDelete(long j);

    public static native PublicKey recover(byte[] bArr, byte[] bArr2);

    public native PublicKey compressed();

    public native byte[] data();

    public native String description();

    public native boolean isCompressed();

    public native PublicKeyType keyType();

    public native PublicKey uncompressed();

    public native boolean verify(byte[] bArr, byte[] bArr2);

    public native boolean verifyAsDER(byte[] bArr, byte[] bArr2);

    public native boolean verifyZilliqaSchnorr(byte[] bArr, byte[] bArr2);

    public PublicKey(byte[] bArr, PublicKeyType publicKeyType) {
        long nativeCreateWithData = nativeCreateWithData(bArr, publicKeyType);
        this.nativeHandle = nativeCreateWithData;
        if (nativeCreateWithData != 0) {
            PublicKeyPhantomReference.register(this, nativeCreateWithData);
            return;
        }
        throw new InvalidParameterException();
    }
}
