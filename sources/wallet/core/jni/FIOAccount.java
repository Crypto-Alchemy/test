package wallet.core.jni;

import java.security.InvalidParameterException;

public class FIOAccount {
    private long nativeHandle;

    private FIOAccount() {
        this.nativeHandle = 0;
    }

    public static FIOAccount createFromNative(long j) {
        FIOAccount fIOAccount = new FIOAccount();
        fIOAccount.nativeHandle = j;
        FIOAccountPhantomReference.register(fIOAccount, j);
        return fIOAccount;
    }

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native String description();

    public FIOAccount(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            FIOAccountPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }
}
