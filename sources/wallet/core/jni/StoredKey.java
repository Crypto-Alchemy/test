package wallet.core.jni;

import java.security.InvalidParameterException;

public class StoredKey {
    private long nativeHandle;

    private StoredKey() {
        this.nativeHandle = 0;
    }

    public static StoredKey createFromNative(long j) {
        StoredKey storedKey = new StoredKey();
        storedKey.nativeHandle = j;
        StoredKeyPhantomReference.register(storedKey, j);
        return storedKey;
    }

    public static native StoredKey importHDWallet(String str, String str2, byte[] bArr, CoinType coinType);

    public static native StoredKey importHDWalletWithEncryption(String str, String str2, byte[] bArr, CoinType coinType, StoredKeyEncryption storedKeyEncryption);

    public static native StoredKey importJSON(byte[] bArr);

    public static native StoredKey importPrivateKey(byte[] bArr, String str, byte[] bArr2, CoinType coinType);

    public static native StoredKey importPrivateKeyWithEncryption(byte[] bArr, String str, byte[] bArr2, CoinType coinType, StoredKeyEncryption storedKeyEncryption);

    public static native StoredKey load(String str);

    public static native long nativeCreate(String str, byte[] bArr);

    public static native long nativeCreateEncryption(String str, byte[] bArr, StoredKeyEncryption storedKeyEncryption);

    public static native long nativeCreateLevel(String str, byte[] bArr, StoredKeyEncryptionLevel storedKeyEncryptionLevel);

    public static native long nativeCreateLevelAndEncryption(String str, byte[] bArr, StoredKeyEncryptionLevel storedKeyEncryptionLevel, StoredKeyEncryption storedKeyEncryption);

    public static native void nativeDelete(long j);

    public native Account account(int i);

    public native int accountCount();

    public native Account accountForCoin(CoinType coinType, HDWallet hDWallet);

    public native Account accountForCoinDerivation(CoinType coinType, Derivation derivation, HDWallet hDWallet);

    public native void addAccount(String str, CoinType coinType, String str2, String str3, String str4);

    public native void addAccountDerivation(String str, CoinType coinType, Derivation derivation, String str2, String str3, String str4);

    public native String decryptMnemonic(byte[] bArr);

    public native byte[] decryptPrivateKey(byte[] bArr);

    public native String encryptionParameters();

    public native byte[] exportJSON();

    public native boolean fixAddresses(byte[] bArr);

    public native String identifier();

    public native boolean isMnemonic();

    public native String name();

    public native PrivateKey privateKey(CoinType coinType, byte[] bArr);

    public native void removeAccountForCoin(CoinType coinType);

    public native void removeAccountForCoinDerivation(CoinType coinType, Derivation derivation);

    public native void removeAccountForCoinDerivationPath(CoinType coinType, String str);

    public native boolean store(String str);

    public native HDWallet wallet(byte[] bArr);

    public StoredKey(String str, byte[] bArr, StoredKeyEncryptionLevel storedKeyEncryptionLevel) {
        long nativeCreateLevel = nativeCreateLevel(str, bArr, storedKeyEncryptionLevel);
        this.nativeHandle = nativeCreateLevel;
        if (nativeCreateLevel != 0) {
            StoredKeyPhantomReference.register(this, nativeCreateLevel);
            return;
        }
        throw new InvalidParameterException();
    }

    public StoredKey(String str, byte[] bArr, StoredKeyEncryptionLevel storedKeyEncryptionLevel, StoredKeyEncryption storedKeyEncryption) {
        long nativeCreateLevelAndEncryption = nativeCreateLevelAndEncryption(str, bArr, storedKeyEncryptionLevel, storedKeyEncryption);
        this.nativeHandle = nativeCreateLevelAndEncryption;
        if (nativeCreateLevelAndEncryption != 0) {
            StoredKeyPhantomReference.register(this, nativeCreateLevelAndEncryption);
            return;
        }
        throw new InvalidParameterException();
    }

    public StoredKey(String str, byte[] bArr) {
        long nativeCreate = nativeCreate(str, bArr);
        this.nativeHandle = nativeCreate;
        if (nativeCreate != 0) {
            StoredKeyPhantomReference.register(this, nativeCreate);
            return;
        }
        throw new InvalidParameterException();
    }

    public StoredKey(String str, byte[] bArr, StoredKeyEncryption storedKeyEncryption) {
        long nativeCreateEncryption = nativeCreateEncryption(str, bArr, storedKeyEncryption);
        this.nativeHandle = nativeCreateEncryption;
        if (nativeCreateEncryption != 0) {
            StoredKeyPhantomReference.register(this, nativeCreateEncryption);
            return;
        }
        throw new InvalidParameterException();
    }
}
