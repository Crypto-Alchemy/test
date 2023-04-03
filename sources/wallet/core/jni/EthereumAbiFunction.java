package wallet.core.jni;

import java.security.InvalidParameterException;

public class EthereumAbiFunction {
    private long nativeHandle;

    private EthereumAbiFunction() {
        this.nativeHandle = 0;
    }

    public static EthereumAbiFunction createFromNative(long j) {
        EthereumAbiFunction ethereumAbiFunction = new EthereumAbiFunction();
        ethereumAbiFunction.nativeHandle = j;
        EthereumAbiFunctionPhantomReference.register(ethereumAbiFunction, j);
        return ethereumAbiFunction;
    }

    public static native long nativeCreateWithString(String str);

    public static native void nativeDelete(long j);

    public native int addInArrayParamAddress(int i, byte[] bArr);

    public native int addInArrayParamBool(int i, boolean z);

    public native int addInArrayParamBytes(int i, byte[] bArr);

    public native int addInArrayParamBytesFix(int i, int i2, byte[] bArr);

    public native int addInArrayParamInt16(int i, short s);

    public native int addInArrayParamInt256(int i, byte[] bArr);

    public native int addInArrayParamInt32(int i, int i2);

    public native int addInArrayParamInt64(int i, long j);

    public native int addInArrayParamInt8(int i, byte b);

    public native int addInArrayParamIntN(int i, int i2, byte[] bArr);

    public native int addInArrayParamString(int i, String str);

    public native int addInArrayParamUInt16(int i, short s);

    public native int addInArrayParamUInt256(int i, byte[] bArr);

    public native int addInArrayParamUInt32(int i, int i2);

    public native int addInArrayParamUInt64(int i, long j);

    public native int addInArrayParamUInt8(int i, byte b);

    public native int addInArrayParamUIntN(int i, int i2, byte[] bArr);

    public native int addParamAddress(byte[] bArr, boolean z);

    public native int addParamArray(boolean z);

    public native int addParamBool(boolean z, boolean z2);

    public native int addParamBytes(byte[] bArr, boolean z);

    public native int addParamBytesFix(int i, byte[] bArr, boolean z);

    public native int addParamInt16(short s, boolean z);

    public native int addParamInt256(byte[] bArr, boolean z);

    public native int addParamInt32(int i, boolean z);

    public native int addParamInt64(long j, boolean z);

    public native int addParamInt8(byte b, boolean z);

    public native int addParamIntN(int i, byte[] bArr, boolean z);

    public native int addParamString(String str, boolean z);

    public native int addParamUInt16(short s, boolean z);

    public native int addParamUInt256(byte[] bArr, boolean z);

    public native int addParamUInt32(int i, boolean z);

    public native int addParamUInt64(long j, boolean z);

    public native int addParamUInt8(byte b, boolean z);

    public native int addParamUIntN(int i, byte[] bArr, boolean z);

    public native byte[] getParamAddress(int i, boolean z);

    public native boolean getParamBool(int i, boolean z);

    public native String getParamString(int i, boolean z);

    public native byte[] getParamUInt256(int i, boolean z);

    public native long getParamUInt64(int i, boolean z);

    public native byte getParamUInt8(int i, boolean z);

    public native String getType();

    public EthereumAbiFunction(String str) {
        long nativeCreateWithString = nativeCreateWithString(str);
        this.nativeHandle = nativeCreateWithString;
        if (nativeCreateWithString != 0) {
            EthereumAbiFunctionPhantomReference.register(this, nativeCreateWithString);
            return;
        }
        throw new InvalidParameterException();
    }
}
