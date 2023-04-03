package wallet.core.jni;

import java.security.InvalidParameterException;

public class DataVector {
    private long nativeHandle;

    public DataVector() {
        long nativeCreate = nativeCreate();
        this.nativeHandle = nativeCreate;
        if (nativeCreate != 0) {
            DataVectorPhantomReference.register(this, nativeCreate);
            return;
        }
        throw new InvalidParameterException();
    }

    public static DataVector createFromNative(long j) {
        DataVector dataVector = new DataVector();
        dataVector.nativeHandle = j;
        DataVectorPhantomReference.register(dataVector, j);
        return dataVector;
    }

    public static native long nativeCreate();

    public static native long nativeCreateWithData(byte[] bArr);

    public static native void nativeDelete(long j);

    public native void add(byte[] bArr);

    public native byte[] get(int i);

    public native int size();

    public DataVector(byte[] bArr) {
        long nativeCreateWithData = nativeCreateWithData(bArr);
        this.nativeHandle = nativeCreateWithData;
        if (nativeCreateWithData != 0) {
            DataVectorPhantomReference.register(this, nativeCreateWithData);
            return;
        }
        throw new InvalidParameterException();
    }
}
