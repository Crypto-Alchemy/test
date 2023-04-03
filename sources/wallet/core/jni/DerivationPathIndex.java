package wallet.core.jni;

import java.security.InvalidParameterException;

public class DerivationPathIndex {
    private long nativeHandle;

    private DerivationPathIndex() {
        this.nativeHandle = 0;
    }

    public static DerivationPathIndex createFromNative(long j) {
        DerivationPathIndex derivationPathIndex = new DerivationPathIndex();
        derivationPathIndex.nativeHandle = j;
        DerivationPathIndexPhantomReference.register(derivationPathIndex, j);
        return derivationPathIndex;
    }

    public static native long nativeCreate(int i, boolean z);

    public static native void nativeDelete(long j);

    public native String description();

    public native boolean hardened();

    public native int value();

    public DerivationPathIndex(int i, boolean z) {
        long nativeCreate = nativeCreate(i, z);
        this.nativeHandle = nativeCreate;
        if (nativeCreate != 0) {
            DerivationPathIndexPhantomReference.register(this, nativeCreate);
            return;
        }
        throw new InvalidParameterException();
    }
}
