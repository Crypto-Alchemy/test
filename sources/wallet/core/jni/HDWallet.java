package wallet.core.jni;

import java.security.InvalidParameterException;

public class HDWallet {
    private long nativeHandle;

    private HDWallet() {
        this.nativeHandle = 0;
    }

    public static HDWallet createFromNative(long j) {
        HDWallet hDWallet = new HDWallet();
        hDWallet.nativeHandle = j;
        HDWalletPhantomReference.register(hDWallet, j);
        return hDWallet;
    }

    public static native PublicKey getPublicKeyFromExtended(String str, CoinType coinType, String str2);

    public static native long nativeCreate(int i, String str);

    public static native long nativeCreateWithEntropy(byte[] bArr, String str);

    public static native long nativeCreateWithMnemonic(String str, String str2);

    public static native long nativeCreateWithMnemonicCheck(String str, String str2, boolean z);

    public static native void nativeDelete(long j);

    public native byte[] entropy();

    public native String getAddressDerivation(CoinType coinType, Derivation derivation);

    public native String getAddressForCoin(CoinType coinType);

    public native PrivateKey getDerivedKey(CoinType coinType, int i, int i2, int i3);

    public native String getExtendedPrivateKey(Purpose purpose, CoinType coinType, HDVersion hDVersion);

    public native String getExtendedPrivateKeyAccount(Purpose purpose, CoinType coinType, Derivation derivation, HDVersion hDVersion, int i);

    public native String getExtendedPrivateKeyDerivation(Purpose purpose, CoinType coinType, Derivation derivation, HDVersion hDVersion);

    public native String getExtendedPublicKey(Purpose purpose, CoinType coinType, HDVersion hDVersion);

    public native String getExtendedPublicKeyAccount(Purpose purpose, CoinType coinType, Derivation derivation, HDVersion hDVersion, int i);

    public native String getExtendedPublicKeyDerivation(Purpose purpose, CoinType coinType, Derivation derivation, HDVersion hDVersion);

    public native PrivateKey getKey(CoinType coinType, String str);

    public native PrivateKey getKeyByCurve(Curve curve, String str);

    public native PrivateKey getKeyDerivation(CoinType coinType, Derivation derivation);

    public native PrivateKey getKeyForCoin(CoinType coinType);

    public native PrivateKey getMasterKey(Curve curve);

    public native String mnemonic();

    public native byte[] seed();

    public HDWallet(int i, String str) {
        long nativeCreate = nativeCreate(i, str);
        this.nativeHandle = nativeCreate;
        if (nativeCreate != 0) {
            HDWalletPhantomReference.register(this, nativeCreate);
            return;
        }
        throw new InvalidParameterException();
    }

    public HDWallet(String str, String str2) {
        long nativeCreateWithMnemonic = nativeCreateWithMnemonic(str, str2);
        this.nativeHandle = nativeCreateWithMnemonic;
        if (nativeCreateWithMnemonic != 0) {
            HDWalletPhantomReference.register(this, nativeCreateWithMnemonic);
            return;
        }
        throw new InvalidParameterException();
    }

    public HDWallet(String str, String str2, boolean z) {
        long nativeCreateWithMnemonicCheck = nativeCreateWithMnemonicCheck(str, str2, z);
        this.nativeHandle = nativeCreateWithMnemonicCheck;
        if (nativeCreateWithMnemonicCheck != 0) {
            HDWalletPhantomReference.register(this, nativeCreateWithMnemonicCheck);
            return;
        }
        throw new InvalidParameterException();
    }

    public HDWallet(byte[] bArr, String str) {
        long nativeCreateWithEntropy = nativeCreateWithEntropy(bArr, str);
        this.nativeHandle = nativeCreateWithEntropy;
        if (nativeCreateWithEntropy != 0) {
            HDWalletPhantomReference.register(this, nativeCreateWithEntropy);
            return;
        }
        throw new InvalidParameterException();
    }
}
