package wallet.core.jni;

import java.security.InvalidParameterException;

public class DerivationPath {
    private long nativeHandle;

    private DerivationPath() {
        this.nativeHandle = 0;
    }

    public static DerivationPath createFromNative(long j) {
        DerivationPath derivationPath = new DerivationPath();
        derivationPath.nativeHandle = j;
        DerivationPathPhantomReference.register(derivationPath, j);
        return derivationPath;
    }

    public static native long nativeCreate(Purpose purpose, int i, int i2, int i3, int i4);

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native int account();

    public native int address();

    public native int change();

    public native int coin();

    public native String description();

    public native DerivationPathIndex indexAt(int i);

    public native int indicesCount();

    public native Purpose purpose();

    public DerivationPath(Purpose purpose, int i, int i2, int i3, int i4) {
        long nativeCreate = nativeCreate(purpose, i, i2, i3, i4);
        this.nativeHandle = nativeCreate;
        if (nativeCreate != 0) {
            DerivationPathPhantomReference.register(this, nativeCreate);
            return;
        }
        throw new InvalidParameterException();
    }

    public DerivationPath(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            DerivationPathPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }
}
