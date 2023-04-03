package wallet.core.jni;

import java.security.InvalidParameterException;

public class Account {
    private long nativeHandle;

    private Account() {
        this.nativeHandle = 0;
    }

    public static Account createFromNative(long j) {
        Account account = new Account();
        account.nativeHandle = j;
        AccountPhantomReference.register(account, j);
        return account;
    }

    public static native long nativeCreate(String str, CoinType coinType, Derivation derivation, String str2, String str3, String str4);

    public static native void nativeDelete(long j);

    public native String address();

    public native CoinType coin();

    public native Derivation derivation();

    public native String derivationPath();

    public native String extendedPublicKey();

    public native String publicKey();

    public Account(String str, CoinType coinType, Derivation derivation, String str2, String str3, String str4) {
        long nativeCreate = nativeCreate(str, coinType, derivation, str2, str3, str4);
        this.nativeHandle = nativeCreate;
        if (nativeCreate != 0) {
            AccountPhantomReference.register(this, nativeCreate);
            return;
        }
        throw new InvalidParameterException();
    }
}
