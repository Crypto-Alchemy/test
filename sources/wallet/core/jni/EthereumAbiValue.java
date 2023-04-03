package wallet.core.jni;

public class EthereumAbiValue {
    private byte[] bytes;

    private EthereumAbiValue() {
    }

    public static EthereumAbiValue createFromNative(byte[] bArr) {
        EthereumAbiValue ethereumAbiValue = new EthereumAbiValue();
        ethereumAbiValue.bytes = bArr;
        return ethereumAbiValue;
    }

    public static native String decodeArray(byte[] bArr, String str);

    public static native String decodeUInt256(byte[] bArr);

    public static native String decodeValue(byte[] bArr, String str);

    public static native byte[] encodeAddress(byte[] bArr);

    public static native byte[] encodeBool(boolean z);

    public static native byte[] encodeBytes(byte[] bArr);

    public static native byte[] encodeBytesDyn(byte[] bArr);

    public static native byte[] encodeInt256(byte[] bArr);

    public static native byte[] encodeInt32(int i);

    public static native byte[] encodeString(String str);

    public static native byte[] encodeUInt256(byte[] bArr);

    public static native byte[] encodeUInt32(int i);
}
