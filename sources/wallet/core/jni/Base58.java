package wallet.core.jni;

public class Base58 {
    private byte[] bytes;

    private Base58() {
    }

    public static Base58 createFromNative(byte[] bArr) {
        Base58 base58 = new Base58();
        base58.bytes = bArr;
        return base58;
    }

    public static native byte[] decode(String str);

    public static native byte[] decodeNoCheck(String str);

    public static native String encode(byte[] bArr);

    public static native String encodeNoCheck(byte[] bArr);
}
