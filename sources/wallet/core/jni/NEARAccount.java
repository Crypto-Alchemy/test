package wallet.core.jni;

import java.security.InvalidParameterException;

public class NEARAccount {
    private long nativeHandle;

    private NEARAccount() {
        this.nativeHandle = 0;
    }

    public static NEARAccount createFromNative(long j) {
        NEARAccount nEARAccount = new NEARAccount();
        nEARAccount.nativeHandle = j;
        NEARAccountPhantomReference.register(nEARAccount, j);
        return nEARAccount;
    }

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native String description();

    public NEARAccount(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            NEARAccountPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }
}
