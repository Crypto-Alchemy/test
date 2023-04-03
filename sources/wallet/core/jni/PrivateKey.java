package wallet.core.jni;

import java.security.InvalidParameterException;

public class PrivateKey {
    private long nativeHandle;

    public PrivateKey() {
        long nativeCreate = nativeCreate();
        this.nativeHandle = nativeCreate;
        if (nativeCreate != 0) {
            PrivateKeyPhantomReference.register(this, nativeCreate);
            return;
        }
        throw new InvalidParameterException();
    }

    public static PrivateKey createFromNative(long j) {
        PrivateKey privateKey = new PrivateKey();
        privateKey.nativeHandle = j;
        PrivateKeyPhantomReference.register(privateKey, j);
        return privateKey;
    }

    public static native boolean isValid(byte[] bArr, Curve curve);

    public static native long nativeCreate();

    public static native long nativeCreateCopy(PrivateKey privateKey);

    public static native long nativeCreateWithData(byte[] bArr);

    public static native void nativeDelete(long j);

    public native byte[] data();

    public native PublicKey getPublicKey(CoinType coinType);

    public native PublicKey getPublicKeyByType(PublicKeyType publicKeyType);

    public native PublicKey getPublicKeyCurve25519();

    public native PublicKey getPublicKeyEd25519();

    public native PublicKey getPublicKeyEd25519Blake2b();

    public native PublicKey getPublicKeyEd25519Cardano();

    public native PublicKey getPublicKeyNist256p1();

    public native PublicKey getPublicKeySecp256k1(boolean z);

    public native byte[] getSharedKey(PublicKey publicKey, Curve curve);

    public native byte[] sign(byte[] bArr, Curve curve);

    public native byte[] signAsDER(byte[] bArr);

    public native byte[] signZilliqaSchnorr(byte[] bArr);

    public PrivateKey(byte[] bArr) {
        long nativeCreateWithData = nativeCreateWithData(bArr);
        this.nativeHandle = nativeCreateWithData;
        if (nativeCreateWithData != 0) {
            PrivateKeyPhantomReference.register(this, nativeCreateWithData);
            return;
        }
        throw new InvalidParameterException();
    }

    public PrivateKey(PrivateKey privateKey) {
        long nativeCreateCopy = nativeCreateCopy(privateKey);
        this.nativeHandle = nativeCreateCopy;
        if (nativeCreateCopy != 0) {
            PrivateKeyPhantomReference.register(this, nativeCreateCopy);
            return;
        }
        throw new InvalidParameterException();
    }
}
